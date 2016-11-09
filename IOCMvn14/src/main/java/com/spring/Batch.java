package com.spring;

public class Batch {
	String bid;
	String sd;
	String timings;
	int nos;
	public Batch(String bid, String sd, String timings, int nos) {
		super();
		this.bid = bid;
		this.sd = sd;
		this.timings = timings;
		this.nos = nos;
	}
	public String toString() {
		String msg="Java Annotation .... New Batch";
		msg=msg+"\n batch Id"+bid;
		msg=msg+"\n Start Date"+sd;
		msg=msg+"\n Timings"+timings;
		msg=msg+"\n No Of Seats"+nos;
		return msg;
	}
}
