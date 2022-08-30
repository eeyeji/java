package kr.brains.interf;

public interface Messenger {
	void sendMsg(String phoneNumber, String msg); //인터페이스이기때문에 abstract안써도 됨
	void receiveMsg();

}
