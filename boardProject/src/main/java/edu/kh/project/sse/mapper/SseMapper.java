package edu.kh.project.sse.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.sse.dto.Notification;

@Mapper
public interface SseMapper {
	
	/** 알림 삽입
	 * @param notification
	 * @return
	 */
	int insertNotification(Notification notification);
	
	/**
	 * 
	 * @param notificationNo
	 * @return
	 */
	Map<String, Object> selectReceiveMember(int notificationNo);
	
	/**
	 * 회원의 알림 목록 조회
	 * @param memberNo
	 * @return
	 */
	List<Notification> selectNotificationList(int memberNo);

}
