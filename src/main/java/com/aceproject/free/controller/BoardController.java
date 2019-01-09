package com.aceproject.free.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.aceproject.free.model.ArticleVo;
import com.aceproject.free.model.CusVo;
import com.aceproject.free.service.impl.BoardServiceImpl;
import com.aceproject.free.service.impl.CusServiceImpl;

@Controller
@SessionAttributes("board")
public class BoardController {

	@Autowired
	private BoardServiceImpl boardService;

	@Autowired
	private CusServiceImpl cusService;

	// customer 관련
	@RequestMapping(method = RequestMethod.GET, value = { "/login.fre" })
	public String loginGET() {
		return "/customer/login.ftl";
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/login.fre" })
	public String loginPOST(HttpServletRequest request, HttpSession session, CusVo cusVo) {
		if (cusService.get(cusVo.getEmail()) == null)
			return "redirect:/";
		session = request.getSession(true);
		cusVo.setCusName(cusService.get(cusVo.getEmail()).getCusName());
		session.setAttribute("email", cusVo.getEmail());
		session.setAttribute("cusName", cusVo.getCusName());
		return "redirect:/main.fre";
	}

	// 로그인 화면에서 회원가입 권유로 이동하게 해야 함.
	@RequestMapping(method = RequestMethod.GET, value = { "/register.fre" })
	public String registerGET() {
		return "/customer/register.ftl";
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/register.fre" })
	public String registerPOST(HttpServletRequest request, HttpSession session, CusVo cusVo) {
		session = request.getSession(true);
		cusService.register(cusVo);
		session.setAttribute("email", session.getAttribute("email"));
		session.setAttribute("cusName", session.getAttribute("cusName"));
		return "redirect:/main.fre";
	}

	@RequestMapping(method = RequestMethod.GET, value = { "/logout.fre" })
	public String logoutGET(HttpSession session) {
		session.invalidate();
		return "/customer/logout.ftl";
	}

	// board 관련
	@RequestMapping(method = RequestMethod.GET, value = { "/main.fre" })
	public String mainGET(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		// 로그인을 한 고객의 정보, main.ftl에서 해당 고객의 글만 수정 가능하도록
		session = request.getSession(true);
		if (session.getAttribute("cusName") == null)
			return "redirect:/";
		
		List<ArticleVo> articleList = boardService.get();
		model.addAttribute("articleList", articleList);
		
		session.setAttribute("email", session.getAttribute("email"));
		session.setAttribute("cusName", session.getAttribute("cusName"));
		
		return "/board/main.ftl";
	}

	@RequestMapping(method = RequestMethod.GET, value = { "/detail.fre" })
	public String detailGET(ModelMap model, HttpServletRequest request,
			HttpSession session) {
		session = request.getSession(true);
		if (session.getAttribute("cusName") == null)
			return "redirect:/";

		String email = session.getAttribute("email").toString();
		String cusName = session.getAttribute("cusName").toString();

		if (request.getParameter("bno") == null) {
			System.out.println("error **************************");
		}

		int articleId = (int) Integer.parseInt(request.getParameter("bno"));

		ArticleVo article = boardService.get(articleId);

		article.setCusName(cusName);
		article.setEmail(email);

		model.addAttribute("articleDetail", article);

		session.setAttribute("email", email);
		session.setAttribute("cusName", cusName);
		session.setAttribute("boardId", articleId);
		session.setAttribute("crtDate", article.getCrtDate());

		return "/board/detail.ftl";
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/modify.fre" })
	public String detailMoidfyPOST(ArticleVo article, HttpServletRequest request, HttpSession session) {
		session = request.getSession(true);

		if (session.getAttribute("cusName") == null)
			return "redirect:/";

		String email = session.getAttribute("email").toString();
		String cusName = session.getAttribute("cusName").toString();
		int articleId = (int) session.getAttribute("boardId");
		Timestamp crtDate = (Timestamp) session.getAttribute("crtDate");

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar time = Calendar.getInstance();

		article.setArticleId(articleId);
		article.setEmail(email);
		article.setCusName(cusName);
		article.setCrtDate(crtDate);
		article.setUpDate(format1.format(time.getTime()));
		boardService.modify(article);

		session.setAttribute("email", email);
		session.setAttribute("cusName", cusName);

		return "redirect:/main.fre";
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/delete.fre" })
	public String detailDeletePOST(ArticleVo article, HttpServletRequest request, HttpSession session) {
		session = request.getSession(true);

		if (session.getAttribute("cusName") == null)
			return "redirect:/";

		String email = session.getAttribute("email").toString();
		String cusName = session.getAttribute("cusName").toString();
		int articleId = (int) session.getAttribute("boardId");

		article = new ArticleVo();
		boardService.remove(articleId);

		session.setAttribute("email", email);
		session.setAttribute("cusName", cusName);

		return "redirect:/main.fre";
	}

	@RequestMapping(method = RequestMethod.GET, value = { "/write.fre" })
	public String writeGET(HttpSession session) {
		return "/board/write.ftl";
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/write.fre" })
	public String writePOST(HttpSession session, HttpServletRequest request, HttpServletResponse response,
			ArticleVo articleVo) {
		response.setContentType("text/html;charset=UTF-8");

		String email = session.getAttribute("email").toString();
		String cusName = session.getAttribute("cusName").toString();

		articleVo.setCusName(cusName);
		articleVo.setEmail(email);
		boardService.register(articleVo);

		return "redirect:/main.fre";
	}

}
