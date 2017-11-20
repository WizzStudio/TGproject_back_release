package site.tgclub.model;

import java.util.Date;

/**
 * 竞赛信息表
 * @author 7lenovo
 *
 */
public class Competation {

	private Integer id;
	private String contestOrganizer;	//竞赛主办方
	private Date startTime;		//竞赛开始时间
	private Date endTime;		//竞赛结束时间
	private String content;		//竞赛具体介绍
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContestOrganizer() {
		return contestOrganizer;
	}
	public void setContestOrganizer(String contestOrganizer) {
		contestOrganizer = contestOrganizer;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
