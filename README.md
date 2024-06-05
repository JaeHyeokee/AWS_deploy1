# AWS 첫번째 배포

### 슷프링 붓 3.2.6 JDK 17
- devtools
- spring web
- lombok
### 배포위치 EC2

### 배포방법
- 로컬에서 github 업로드
- EC2에서 github 다운로드
- 프로젝트 테스트
- 프로젝트 빌드
- nohub 으로 백그라운드 실행
- 오류 로그 남기기 (표준 입출력 리다이렉션)
- 서버가 종료되면 cron으로 자동 재시작