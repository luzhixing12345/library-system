package com.library.dao;

import com.library.bean.Paper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PaperDao {

    private final static String NAMESPACE = "com.library.dao.PaperDao.";
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public int matchPaper(final String searchWord) {
        String search = "%" + searchWord + "%";
        return sqlSessionTemplate.selectOne(NAMESPACE + "matchPaper", search);
    }

    public ArrayList<Paper> queryPaper(final String searchWord) {
        String search = "%" + searchWord + "%";
        List<Paper> result = sqlSessionTemplate.selectList(NAMESPACE + "queryPaper", search);
        return (ArrayList<Paper>) result;
    }

    public ArrayList<Paper> getAllPapers() {
        List<Paper> result = sqlSessionTemplate.selectList(NAMESPACE + "getAllPapers");
        return (ArrayList<Paper>) result;
    }

    public int addPaper(final Paper paper) {
        return sqlSessionTemplate.insert(NAMESPACE + "addPaper", paper);
    }

    public Paper getPaper(final long paperId) {
        return sqlSessionTemplate.selectOne(NAMESPACE + "getPaper", paperId);
    }

    public int editPaper(final Paper paper) {
        return sqlSessionTemplate.update(NAMESPACE + "editPaper", paper);
    }

    public int deletePaper(final long paperId) {
        return sqlSessionTemplate.delete(NAMESPACE + "deletePaper", paperId);
    }
}
