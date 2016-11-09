package com.spring;

public class Workshop {
	String topic;
	double fee;
	int nos;
	public Workshop(String topic, double fee, int nos) {
		super();
		this.topic = topic;
		this.fee = fee;
		this.nos = nos;
	}
	public String toString() {
		String msg="Java Annotation .... New Batch";
		msg=msg+"\n topic"+topic;
		msg=msg+"\n fee"+fee;
		msg=msg+"\n No Of Seats"+nos;
		return msg;
	}
}
