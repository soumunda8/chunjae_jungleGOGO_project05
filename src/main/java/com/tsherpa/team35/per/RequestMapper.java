package com.tsherpa.team35.per;

import com.tsherpa.team35.entity.Request;
import com.tsherpa.team35.util.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface RequestMapper {
    public void requestInsert(Request request) throws Exception;
    public List<Request> requestList(Page page) throws Exception;
    public Request requestDetail(int reqNo) throws Exception;
    List<Request> getMoreRequests(int offset, int limit) ;
    public void requestEdit(Request request) throws Exception;
    public void requestDelete(int reqNo) throws Exception;
    public List<Request> allRequest() throws Exception;
    public void requestEditAll(Request request) throws Exception;
    public void readable(int readable,int reqNo);
    public List<Request> userRequestList(String loginId);
    public int getRequestCnt() throws Exception;
    public List<Request> getRequestListForMain() throws Exception;
    public int getReqCount(Page page);

}
