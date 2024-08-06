package study.querydsl.repository;

import java.util.List;
import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;

// 프로젝트가 커지고 특정 API에 맞춘 조회 API가 많이 생긴다면 QueryRepository를 분리하는 것도 방법이다.
public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
}
