package com.mengma.service.impl;

import com.mengma.dao.ResumeDao;
import com.mengma.pojo.Resume;
import com.mengma.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fgm
 * @description
 * @date 2020-03-05
 ***/
@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public List<Resume> findAll() {
        return resumeDao.findAll();
    }

    @Override
    public Long saveResume(Resume resume) {
        Resume result=  resumeDao.save(resume);
        return result.getId();
    }

    @Override
    public Boolean removeById(Long id) {
        resumeDao.deleteById(id);
        return Boolean.TRUE;
    }
}
