package 추상클래스;

public interface PoleFind {
	void gameTry();//첫 시도 인지 재도전인지 확인 기능
	void gameChoose();//전신주 찾는 게임 선택시 개인인지 클랜인지 선택 기능
	void findMap();//전신주 거리 확인 및 제공하고 전신주 사이를 이어주고, 지도에 마커 표시 기능
	void checkAnswer();//찾은 사진이 정답인지 확인 기능
	void Hint();//문제의 힌트 3개 제공 및 사용한 힌트 확인 기능
	void poleInfo();//전신주의 정보관련 정의(이미지 업로드 및 이미지 확인)
	void finderRecord();//찾기 완료한 게임의 기록 등록
	void finderPoint();//찾기 완료한 문제의 포인트 계산 및 사용자에게 제공
}
