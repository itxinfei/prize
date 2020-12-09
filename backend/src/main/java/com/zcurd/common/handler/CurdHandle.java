package com.zcurd.common.handler;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.zcurd.online.vo.ZcurdMeta;

public interface CurdHandle {

    void add(ZcurdMeta zcurdMeta, HttpServletRequest req, Map<String, String[]> paraMap);

    void update(ZcurdMeta zcurdMeta, HttpServletRequest req, Map<String, String[]> paraMap);

    void delete(ZcurdMeta zcurdMeta, HttpServletRequest req, Map<String, String[]> paraMap);

}
