# cs496_common1 

## A.개발팀원
### - 박병현 (DGIST 기초학부)
### - 신혁교 (한양대학교 컴퓨터소프트웨어학과)

## B.프로젝트
### TAB1 : 연락처
![그림1](https://user-images.githubusercontent.com/107671359/177317754-6957ab30-29d3-4422-921b-bd7c384df7d7.png)
* 연락처가 포함된 JSON 파일을 리사이클러 뷰를 통해 목록에 표시했다.
* 연락처 항목을 누르면 Dial Intent를 통해 기기에 내장된 전화 앱으로 연결된다.
* 경기데이터드림(https://data.gg.go.kr/portal/mainPage.do) 에서 '경기도선별진료소현황' 파일을 받아와 사용했다.


### TAB2 : 갤러리
![그림2](https://user-images.githubusercontent.com/107671359/177319279-9f4c5994-b32b-4077-bdc2-a347b66b396b.png)
* 미리 저장해 둔 이미지 파일들을 Drawable 폴더에 저장했다.
* Recycler View의 GridLayoutManager를 통해 Grid 형태로 갤러리 구성했다.
* 각 image를 클릭 시 새로운 Activity를 호출한다.
* 새로운 Activity는 ViewPager2를 통해 양 옆의 이미지를 slide로 보여준다.
* 새로운 Activity의 이미지는 PhotoView layout을 이용하여 확대, 축소가 가능하다.


### TAB3 : 공룡런
![그림3](https://user-images.githubusercontent.com/107671359/177319319-7c4b2595-09d1-4bfc-a7a6-58295cc596f3.png)
* Chrome의 T-Rex Runner 탭으로, 모바일에서 간단하게 즐길 수 있도록 했다.
* T-Rex Runner (https://github.com/wayou/t-rex-runner) 를 Asset 폴더에 저장한 후, WebView로 게임을 보여준다.
