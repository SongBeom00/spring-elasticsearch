package com.ll.elk.global.initdata;

import com.ll.elk.domain.post.post.service.PostService;
import com.ll.elk.domain.post.postdoc.service.PostDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.IntStream;

@Configuration
@RequiredArgsConstructor
public class BaseInitData {
    private final PostDocService postDocService;
    private final PostService postService;

    @Bean
    public ApplicationRunner applicationRunner(){
        return args -> {
            work1();
            work2();
        };
    }

    private void work1() {
        postDocService.truncate();

        postDocService.write("하루 일과 정리", "오늘 하루를 돌아보며 느꼈던 생각들을 정리해보았습니다. 작은 것에도 감사하며 하루를 마무리했습니다.");
        postDocService.write("코딩의 즐거움", "어제 밤새 고민했던 오류를 해결했습니다! 디버깅 과정에서 배운 점을 기록해봅니다.");
        postDocService.write("겨울 여행 계획", "올해 겨울에는 강원도로 여행을 떠나기로 했습니다. 주요 일정과 방문하고 싶은 곳을 정리해보았습니다.");
        postDocService.write("첫 직장 출근기", "드디어 첫 출근을 했습니다! 긴장도 되고 설레기도 했지만, 좋은 동료들과 함께해서 기대됩니다.");
        postDocService.write("커피 원두 추천", "최근에 맛본 커피 원두 중에서 가장 마음에 들었던 것들을 정리해봅니다.");
        postDocService.write("운동 루틴 기록", "이번 주 운동 루틴을 정리했습니다. 체력도 조금씩 늘어나는 게 느껴져서 뿌듯합니다.");
        postDocService.write("영화 리뷰 - 인터스텔라", "오늘 인터스텔라를 다시 봤습니다. 볼 때마다 새로운 메시지를 발견하네요.");
        postDocService.write("맛집 탐방기", "주말에 친구들과 다녀온 맛집을 소개합니다. 분위기와 음식 모두 만족스러웠던 곳!");
        postDocService.write("독서 기록 - 나미야 잡화점의 기적", "오랜만에 마음을 울리는 책을 읽었습니다. 나미야 잡화점의 기적을 추천합니다.");
        postDocService.write("코딩 팀 공유", "개발 중 알게 된 작은 팁을 정리합니다. 사소하지만 생산성을 크게 향상시켜 줍니다.");
        postDocService.write("기타를 배우는 기타", "기타를 배우기 시작했습니다! 손가락이 조금 아프지만, 매일 연습하며 즐기고 있습니다.");
        postDocService.write("반려견과의 산책", "오늘 반려견과 함께 공원을 산책했습니다. 맑은 날씨 덕분에 기분 좋은 시간을 보냈습니다.");
        postDocService.write("다음 프로젝트 아이디어", "새로운 프로젝트 아이디어가 떠올랐습니다. 기획 단계부터 차근차근 준비해야겠습니다.");

        // 추가된 테스트 데이터
        postDocService.write("맛있는 커피를 마시다", "오늘 친구와 커피를 마셨어요");
        postDocService.write("커피가 좋아요", "아메리카노가 제일 좋아요");
        postDocService.write("커피를 마시며", "커피를 마시면서 책을 읽었습니다");
        postDocService.write("맛있는 케이크", "커피와 함께 케이크도 먹었어요");
        postDocService.write("카페에서 공부", "카페에서 커피를 마시며 공부했어요");

        // 조사가 다른 경우의 테스트
        postDocService.write("커피가 맛있다", "이 카페 커피는 정말 맛있어요");
        postDocService.write("커피를 주문했다", "카페에서 커피를 주문했습니다");
        postDocService.write("커피의 향", "커피의 향이 너무 좋아요");

        // 복합명사 테스트
        postDocService.write("아이스커피 추천", "시원한 아이스커피 맛집을 찾았어요");
        postDocService.write("커피메이커 구매", "새로운 커피메이커로 핸드드립 커피를 내려마셨어요");

        IntStream.rangeClosed(15, 100).forEach(i -> {
            postDocService.write("제목 " + i, "내용 " + i);
        });


//        IntStream.rangeClosed(13, 100).forEach(i -> postDocService.write("제목 " + i, "내용 " + i));


    }

    private void work2() {
        postService.truncate();

//        postService.write("하루 일과 정리", "오늘 하루를 돌아보며 느꼈던 생각들을 정리해보았습니다. 작은 것에도 감사하며 하루를 마무리했습니다.");
//        postService.write("코딩의 즐거움", "어제 밤새 고민했던 오류를 해결했습니다! 디버깅 과정에서 배운 점을 기록해봅니다.");
//        postService.write("겨울 여행 계획", "올해 겨울에는 강원도로 여행을 떠나기로 했습니다. 주요 일정과 방문하고 싶은 곳을 정리해보았습니다.");
//        postService.write("첫 직장 출근기", "드디어 첫 출근을 했습니다! 긴장도 되고 설레기도 했지만, 좋은 동료들과 함께해서 기대됩니다.");
//        postService.write("커피 원두 추천", "최근에 맛본 커피 원두 중에서 가장 마음에 들었던 것들을 정리해봅니다.");
//        postService.write("운동 루틴 기록", "이번 주 운동 루틴을 정리했습니다. 체력도 조금씩 늘어나는 게 느껴져서 뿌듯합니다.");
//        postService.write("영화 리뷰 - 인터스텔라", "오늘 인터스텔라를 다시 봤습니다. 볼 때마다 새로운 메시지를 발견하네요.");
//        postService.write("맛집 탐방기", "주말에 친구들과 다녀온 맛집을 소개합니다. 분위기와 음식 모두 만족스러웠던 곳!");
//        postService.write("독서 기록 - 나미야 잡화점의 기적", "오랜만에 마음을 울리는 책을 읽었습니다. 나미야 잡화점의 기적을 추천합니다.");
//        postService.write("코딩 팀 공유", "개발 중 알게 된 작은 팁을 정리합니다. 사소하지만 생산성을 크게 향상시켜 줍니다.");
//        postService.write("기타를 배우는 기타", "기타를 배우기 시작했습니다! 손가락이 조금 아프지만, 매일 연습하며 즐기고 있습니다.");
//        postService.write("반려견과의 산책", "오늘 반려견과 함께 공원을 산책했습니다. 맑은 날씨 덕분에 기분 좋은 시간을 보냈습니다.");
//        postService.write("다음 프로젝트 아이디어", "새로운 프로젝트 아이디어가 떠올랐습니다. 기획 단계부터 차근차근 준비해야겠습니다.");

    }

}
