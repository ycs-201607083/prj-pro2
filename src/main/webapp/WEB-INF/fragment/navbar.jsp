<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:set value="${not empty sessionScope.loggedInMember}" var="loggedIn"/>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="/board/list">JSP 게시판</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/board/new">
                        <i class="fa-regular fa-pen-to-square"></i>
                        게시글 작성
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/board/list">
                        <i class="fa-regular fa-rectangle-list"></i>
                        게시글 목록
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/member/signup">
                        <i class="fa-solid fa-user-plus"></i>
                        회원가입
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/member/login">
                        <i class="fa-solid fa-arrow-right-to-bracket"></i>
                        로그인
                    </a>
                </li>
                <li>

                </li>
                <div>
                    아이디 : ${sessionScope.loggedInMember.id}
                </div>
            </ul>
        </div>
    </div>
</nav>