package com.xzp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xzp.pojo.po.Repo;

/**
 * 回购服务
 *
 * @author 薛展鹏
 * @description 针对表【t_repo(课程表)】的数据库操作Service
 * @date 2023/03/28
 */
public interface RepoService extends IService<Repo> {

    void deleteRepo(Repo repo);
}
