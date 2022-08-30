package thebrains.pim.repository;

import thebrains.pim.model.Member;
import java.util.ArrayList;
import java.util.List;

public class MemberRepositoryImpl<T> implements MemberRepository<T> {

    public List<T> memberList = null;
    public MemberRepositoryImpl() {
    	memberList = new ArrayList<T>(); //메모리 상에 회원정보들을 유지해주는 객체
    }
    

    @Override
    public int create(T member) {
        int ret = 0;
        try {
            memberList.add((T) member);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        
    }

    @Override
    public T readById(T member) {
        return null;
    }

    @Override
    public T readByEmail(T member) {
        for(T m : memberList) {
            if(((Member) m).getEmail().equals(((Member) member).getEmail()))
                return m; // 첫 번째 email 같은 요소를 반환
        }
        return null;
    }

    @Override
    public List<T> readList() {
        return getMemberList();
    }

    @Override
    public int update(T member) {
        return 0;
    }

    @Override
    public int delete(T member) {
        return 0;
    }

  

    @Override
    public List<T> getMemberList() {
        return memberList;
    }

    @Override
    public void setMemberList(List<T> memberList) {
        this.memberList = memberList;
    }
}
