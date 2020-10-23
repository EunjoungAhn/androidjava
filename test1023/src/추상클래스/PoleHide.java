package 추상클래스;

public interface PoleHide {
	void hideMap();//전신주 거리 확인 및 제공하고 전신주 사이를 이어주고, 지도에 마커 표시 기능
	void poleInfo();//전신주의 정보관련 정의(이미지 업로드 및 이미지 확인)
	void createHint();//전신주 문제의 힌트를 만들어 등록해 주는 기능
	void hideRecord();//내가 숨긴 전신주의 기록 관련 기능
	void createQuestion();//숨기는 사람의 문제 등록 및 관리자에게 확인 기능
}