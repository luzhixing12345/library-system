package com.library.service;

import com.library.bean.Paper;
import com.library.dao.PaperDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PaperService {
    @Autowired
    private PaperDao paperDao;

    public ArrayList<Paper> queryPaper(String searchWord) {
        return paperDao.queryPaper(searchWord);
    }

    public ArrayList<Paper> getAllPapers() {
        return paperDao.getAllPapers();
    }

    public boolean matchPaper(String searchWord) {
        return paperDao.matchPaper(searchWord) > 0;
    }

    public boolean addPaper(Paper paper) {
        return paperDao.addPaper(paper) > 0;
    }

    public Paper getPaper(Long paperId) {
        return paperDao.getPaper(paperId);
    }

    public boolean editPaper(Paper paper) {
        return paperDao.editPaper(paper) > 0;
    }

    public boolean deletePaper(Long paperId) {
        return paperDao.deletePaper(paperId) > 0;
    }

}
