enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class WeeklySchedule {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.FRIDAY;

        System.out.println("오늘은 " + getDayNameInKorean(today) + "입니다.");

        // TODO: 요일별 활동 추천 switch문
        // 힌트: switch-case 사용
        // 여기에 코드를 작성하세요
        System.out.println("\n=== 활동 추천 ===");
        switch (today) {
            case MONDAY -> System.out.println("학교 가기\n주간 할 일 정리\n저녁 식사");
            case THURSDAY -> System.out.println("학교 가기\n일기 쓰기\n저녁 식사");
            case WEDNESDAY -> System.out.println("학교 가기\n오늘 한 일 정리\n저녁 식사");
            case TUESDAY -> System.out.println("학교 가기\n장 보기\n친구와 저녁 식사");
            case FRIDAY -> System.out.println("🎉 한 주 마무리하기\n📊 주간 성과 정리\n🍕팀과 함께 저녁 식사");
        }

        // TODO: 업무일/휴일 구분
        // 힌트: switch 표현식
        boolean isWorkday = switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> true;
            case SATURDAY, SUNDAY -> false;
            default -> false;
        };

        System.out.println(isWorkday ? "평일입니다." : "주말입니다.");
    }

    public static String getDayNameInKorean(DayOfWeek day) {
        // TODO: switch 표현식으로 한국어 요일 명 반환
        // 힌트: -> 연산자
        return switch (day) {
            case MONDAY -> "월요일";
            case THURSDAY -> "화요일";
            case WEDNESDAY -> "수요일";
            case TUESDAY -> "목요일";
            case FRIDAY -> "금요일";
            case SATURDAY -> "토요일";
            case SUNDAY -> "일요일";
        };
    }
}