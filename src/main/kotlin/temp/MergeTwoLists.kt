import datatype.ListNode

// LeetCode 기본 제공 ListNode 가정
class Solution {

    /*
    (mergeTwoLists 함수 요약)
    - 전제: m = list1 길이, n = list2 길이
    - 핵심 연산: 두 포인터로 병합(각 노드 최대 1회 방문)
    - 전체 시간복잡도(Time Complexity): O(m + n)
    - 전체 공간복잡도(Space Complexity): O(1)  // 추가 배열/리스트 미사용, 포인터만 이동
    */
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        // 더미 노드로 시작하면 머리 교체(edge case) 처리가 단순해짐
        val dummy = ListNode(0)
        var tail = dummy

        var p1 = list1
        var p2 = list2

        // 두 리스트 모두 노드가 남아있는 동안 작은 값을 이어붙임
        while (p1 != null && p2 != null) {
            if (p1.`val` <= p2.`val`) {
                tail.next = p1      // tail 뒤에 p1 연결
                p1 = p1.next        // p1 한 칸 전진
            } else {
                tail.next = p2      // tail 뒤에 p2 연결
                p2 = p2.next        // p2 한 칸 전진
            }
            tail = tail.next!!      // tail 포인터 갱신
        }

        // 한쪽이 남아있다면 그대로 뒤에 연결 (이미 정렬되어 있음)
        tail.next = p1 ?: p2

        // 더미 다음이 실제 머리
        return dummy.next
    }
}

/*
[엑셀용 최종 정리]
- mergeTwoLists 전체 시간복잡도: O(m + n)
- mergeTwoLists 전체 공간복잡도: O(1)
(m: list1 길이, n: list2 길이)
*/
