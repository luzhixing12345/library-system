package com.library.controller;

import com.library.bean.Paper;
import com.library.bean.Lend;
import com.library.bean.ReaderCard;
import com.library.service.PaperService;
import com.library.service.LendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class PaperController {
    @Autowired
    private PaperService paperService;


    private Date getDate(String pubstr) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            return df.parse(pubstr);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }

    @RequestMapping("/querypaper.html")
    public ModelAndView queryPaperDo(String searchWord) {
        if (paperService.matchPaper(searchWord)) {
            ArrayList<Paper> papers = paperService.queryPaper(searchWord);
            ModelAndView modelAndView = new ModelAndView("admin_papers");
            modelAndView.addObject("papers", papers);
            return modelAndView;
        } else {
            return new ModelAndView("admin_papers", "error", "没有匹配的论文");
        }
    }

    @RequestMapping("/reader_querypaper_do.html")
    public ModelAndView readerQueryPaperDo(String searchWord) {
        if (paperService.matchPaper(searchWord)) {
            ArrayList<Paper> papers = paperService.queryPaper(searchWord);
            ModelAndView modelAndView = new ModelAndView("reader_papers");
            modelAndView.addObject("papers", papers);
            return modelAndView;
        } else {
            return new ModelAndView("reader_papers", "error", "没有匹配的论文");
        }
    }

    @RequestMapping("/admin_papers.html")
    public ModelAndView adminPapers() {
        ArrayList<Paper> papers = paperService.getAllPapers();
        ModelAndView modelAndView = new ModelAndView("admin_papers");
        modelAndView.addObject("papers", papers);
        return modelAndView;
    }

    @RequestMapping("/paper_add.html")
    public ModelAndView addPaper() {
        return new ModelAndView("admin_paper_add");
    }

    @RequestMapping("/paper_add_do.html")
    public String addPaperDo(Paper paper, RedirectAttributes redirectAttributes) {
        if (paperService.addPaper(paper)) {
            redirectAttributes.addFlashAttribute("succ", "论文添加成功！");
        } else {
            redirectAttributes.addFlashAttribute("succ", "论文添加失败！");
        }
        return "redirect:/admin_papers.html";
    }

    @RequestMapping("/updatepaper.html")
    public ModelAndView paperEdit(HttpServletRequest request) {
        long paperId = Long.parseLong(request.getParameter("paperId"));
        Paper paper = paperService.getPaper(paperId);
        ModelAndView modelAndView = new ModelAndView("admin_paper_edit");
        modelAndView.addObject("detail", paper);
        return modelAndView;
    }

    @RequestMapping("/paper_edit_do.html")
    public String paperEditDo(Paper paper, RedirectAttributes redirectAttributes) {

        if (paperService.editPaper(paper)) {
            redirectAttributes.addFlashAttribute("succ", "论文修改成功！");
        } else {
            redirectAttributes.addFlashAttribute("error", "论文修改失败！");
        }
        return "redirect:/admin_papers.html";
    }

    @RequestMapping("/admin_paper_detail.html")
    public ModelAndView adminPaperDetail(HttpServletRequest request) {
        long paperId = Long.parseLong(request.getParameter("paperId"));
        Paper paper = paperService.getPaper(paperId);
        ModelAndView modelAndView = new ModelAndView("admin_paper_detail");
        modelAndView.addObject("detail", paper);
        return modelAndView;
    }

    @RequestMapping("/reader_paper_detail.html")
    public ModelAndView readerPaperDetail(HttpServletRequest request) {
        long paperId = Long.parseLong(request.getParameter("paperId"));
        Paper paper = paperService.getPaper(paperId);
        ModelAndView modelAndView = new ModelAndView("reader_paper_detail");
        modelAndView.addObject("detail", paper);
        return modelAndView;
    }


    @RequestMapping("/reader_papers.html")
    public ModelAndView readerPapers(HttpServletRequest request) {
        ArrayList<Paper> papers = paperService.getAllPapers();
        ReaderCard readerCard = (ReaderCard) request.getSession().getAttribute("readercard");

        ModelAndView modelAndView = new ModelAndView("reader_papers");
        modelAndView.addObject("papers", papers);
        return modelAndView;
    }
}
