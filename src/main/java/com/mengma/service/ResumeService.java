package com.mengma.service;


import com.mengma.pojo.Resume;

import java.util.List;

/**
 * @author fgm
 * @description
 * @date 2020-03-05
 ***/
public interface ResumeService {
    /**
     * 查询所有
     * @return
     */
    List<Resume> findAll();

    /**
     * 保存
     * @param resume
     * @return
     */
    Long saveResume(Resume resume);

    /**
     * 删除
     * @param id
     * @return
     */
    Boolean removeById(Long id);

}
