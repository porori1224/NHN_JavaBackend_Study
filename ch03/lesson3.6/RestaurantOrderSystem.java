import textio.TextIO;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        System.out.println("🍽️ 레스토랑 주문 시스템에 오신 것을 환영합니다!");

        while (true) {
            showMainMenu();
            int choice = TextIO.getlnInt();

            if (choice == 0) {
                System.out.println("이용해 주셔서 감사합니다! 👋");
                break;
            }

            processMenuChoice(choice);
        }
    }

    public static void showMainMenu() {
        System.out.println("""
            
            === 메인 메뉴 ===
            1. 🍝 파스타 메뉴
            2. 🍕 피자 메뉴
            3. 🥗 샐러드 메뉴
            4. 🍰 디저트 메뉴
            5. ☕ 음료 메뉴
            6. 🛒 주문 확인
            7. 💳 결제하기
            0. 종료
            
            선택하세요: """);
    }

    public static void processMenuChoice(int choice) {
        // TODO: 메뉴 선택 처리
        // 힌트: switch문으로 각 메뉴 처리
        // 여기에 코드를 작성하세요
        switch (choice) {
            case 1 -> showSubMenu("🍝 파스타 메뉴", new String[] {
                    "스파게티 까르보나라 - 15,000원",
                    "토마토 파스타 - 12,000원",
                    "크림 파스타 - 14,000원",
                    "페스토 파스타 - 16,000원"
            });
            case 2 -> showSubMenu("🍕 피자 메뉴", new String[] {
                    "메뉴 준비중"
            });
            case 3 -> showSubMenu("🥗 샐러드 메뉴", new String[] {
                    "메뉴 준비중"
            });
            case 4 -> showSubMenu("🍰 디저트 메뉴", new String[] {
                    "메뉴 준비중"
            });
            case 5 -> showSubMenu("☕ 음료 메뉴", new String[] {
                    "메뉴 준비중"
            });
            case 6 -> {
                System.out.println("\n🛒 현재 주문 확인 기능은 구현되어 있지 않습니다.");
                System.out.println("추후 업데이트 예정입니다!");
            }
            case 7 -> {
                System.out.println("💳 결제 진행");
                processPayment();
            }

            default -> System.out.println("잘못된 입력입니다.");
        }
    }

    public static void showSubMenu(String category, String[] items) {
        System.out.println("\n=== " + category + " 상세 메뉴 ===");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }
        System.out.println("메인 메뉴로 돌아가려면 엔터를 누르세요.");
        TextIO.getln();
    }

    public static void processPayment() {
        System.out.print("결제 방법을 선택하세요 (card/cash/mobile): ");
        String paymentMethod = TextIO.getln().toLowerCase();

        // TODO: 결제 방법별 처리
        // 힌트: switch 표현식과 yield
        String message = switch (paymentMethod) {
            case "card" -> {
                yield "카드를 삽입해주세요...💳 카드 결제가 완료되었습니다.\n";
            }
            case "cash" -> {
                yield "현금을 삽입해주세요...💵 현금 결제가 완료되었습니다. \n";
            }
            case "mobile" -> {
                yield "모바일 결제 인증 중...📱 모바일 결제가 완료되었습니다.\n";
            }

            default -> {
                yield "결제 오류! 다시 시도하세요.";
            }
        };

        System.out.println(message);
        if (!message.startsWith("❌")) {
            System.out.println("주문이 접수되었습니다. 조리 시간은 15-20분입니다. 🍽️");
        }
    }
}