# 스프링 부트 CRUD 템플릿 프로젝트

이 프로젝트는 스프링 부트를 사용하여 기본적인 CRUD (Create, Read, Update, Delete) 기능을 제공하는 웹 애플리케이션 템플릿입니다. OAuth2 인증을 통한 사용자 관리 및 게시글 관리를 포함합니다.

## 프로젝트 구조

### 컨트롤러 (Controller)

* **`MemberController.java`**:
    * 회원 관련 API를 처리합니다.
    * 회원 목록 조회, 특정 회원 조회, 회원 생성, 수정, 삭제 기능을 제공합니다.
    * `/api/members` 엔드포인트로 접근 가능합니다.
    * `/api/members/me` 엔드포인트로 현재 인증된 사용자 정보를 제공합니다.
    * `CustomOAuth2User`를 사용하여 인증된 사용자 정보를 가져옵니다.
* **`PostController.java`**:
    * 게시글 관련 API를 처리합니다.
    * 게시글 목록 조회, 특정 게시글 조회, 게시글 생성, 수정, 삭제 기능을 제공합니다.
    * `/api/posts` 엔드포인트로 접근 가능합니다.
    * OAuth2 인증을 통해 사용자를 확인하고, 게시글 작성 및 수정/삭제 권한을 관리합니다.
* **`MainController.java`**:
    * HTML 페이지 요청을 처리합니다.
    * `/read-only`, `/main`, `/login` 엔드포인트로 접근 가능합니다.
    * 각 엔드포인트에 해당하는 HTML 페이지를 반환합니다.

### 엔티티 (Entity)

* **`Member.java`**:
    * 회원 정보를 담는 엔티티 클래스입니다.
    * 회원 ID, 이름, 기타 회원 관련 정보를 포함합니다.
* **`Post.java`**:
    * 게시글 정보를 담는 엔티티 클래스입니다.
    * 게시글 id, 제목, 내용, 작성자(Member), 작성시간을 포함합니다.

### 보안 (Security)

* **`CustomOAuth2User.java`**:
    * OAuth2 인증을 통해 얻은 사용자 정보를 담는 클래스입니다.
    * 인증된 사용자 정보를 기반으로 회원 정보를 제공합니다.
* Spring Security를 사용하여 OAuth2 인증을 처리하고, API 접근 권한을 관리합니다.

### 서비스 (Service)

* **`MemberService.java`**:
    * 회원 관련 비즈니스 로직을 처리합니다.
* **`PostService.java`**:
    * 게시글 관련 비즈니스 로직을 처리합니다.

### HTML 페이지

* `read-only.html`, `crud-board.html`, `login.html` 등의 HTML 페이지를 제공하여 사용자 인터페이스를 구성합니다.

## 주요 기능

* OAuth2 인증을 통한 사용자 로그인 및 관리
* 회원 정보 조회, 생성, 수정, 삭제
* 게시글 목록 조회, 상세 조회, 생성, 수정, 삭제
* 인증된 사용자만 게시글 작성 및 수정/삭제 가능
* RESTful API 제공

## 실행 방법

1.  프로젝트를 클론합니다.
2.  의존성을 설치합니다. (Maven 또는 Gradle)
3.  데이터베이스 설정을 구성합니다.
4.  애플리케이션을 실행합니다.
