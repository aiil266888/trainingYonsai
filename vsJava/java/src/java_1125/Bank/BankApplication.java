package java_1125.Bank;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    //모든 계좌정보 저장 - 하나의 배열에 저장하니 새로운  배열을 만들 필요가 없으므로 static사용
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while(run){
            System.out.println("--------------------------------------------------");
            System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.print(" 선택 > ");

            int selectNo  = Integer.parseInt(scanner.nextLine());
            if(selectNo == 1){
                createAccount();
            }else if(selectNo ==2){
                accountList();
            }else if(selectNo ==3){
                deposit();
            }else if (selectNo ==4){
                withdraw();
            }else if (selectNo ==5){
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }
    }

    //계좌 생성하기
    private static void createAccount() {
        System.out.println("계좌를 생성합니다");
        System.out.println("-------------------------------------------------");
        System.out.print("새로운 계좌번호를 입력하세요 : ");
        String ano = scanner.nextLine();
        System.out.println();
        System.out.print("계좌주를 입력하세요 : ");
        String owner = scanner.nextLine();
        System.out.println();
        System.out.print("초기입금액을 입력하세요 : ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(ano,owner,balance);
        for(int i = 0 ; i<accountArray.length; i++){ ///0부터 100까지 순회하다가
            if(accountArray[i] == null){//비어있는 방이 있으면
                accountArray[i] = newAccount; //집어넣기
                System.out.println("계좌가 생성되었습니다");
                break;
            }
        }//END for
        //accountArray[0] = newAccount("110-110", "홍길동",10000)
    }//END create Account


    private static void accountList() {
        System.out.println("-----------------------------------");
        System.out.println(" 계좌목록 조회 ");
        System.out.println("-----------------------------------");
        for(int i = 0 ; i<accountArray.length; i++){
            Account account = accountArray[i];
            if(account != null){
                System.out.println("계좌번호 : " +account.getAno());
                System.out.println("계좌주 : " +account.getOwner());
                System.out.println("잔고 : " +account.getBalance());
            }
        }
    }//END accountList

    private static void deposit() {
        System.out.println("-----------------------------------");
        System.out.println("예금");
        System.out.println("-----------------------------------");
        System.out.println("계좌번호 : ");
        String ano = scanner.nextLine();
        System.out.print("예금액 : ");
        int money = Integer.parseInt(scanner.nextLine());
        Account account = findAccount(ano);
        if(account == null){
            System.out.println("계좌가 존재하지 않습니다");
            return;
        }
        account.setBalance(account.getBalance() + money);
        //현재 계좌 잔액을 getter로 불러와서 예금액(money)를 더한 후
        //setBalance로 더한 금액을 넣기
    }//END deposit

    private static void withdraw() {
        System.out.println("-----------------------------------");
        System.out.println("출금");
        System.out.println("-----------------------------------");
        System.out.println("계좌번호 : ");
        String ano = scanner.nextLine();
        System.out.print("출금액 : ");
        int money = Integer.parseInt(scanner.nextLine());
        Account account = findAccount(ano);
        if(account == null){
            System.out.println("계좌가 존재하지 않습니다");
            return;
        }

        if(account.getBalance()-money<0){
            System.out.println("잔고가 부족합니다");
        }else{
            account.setBalance(account.getBalance() - money);
            System.out.println("출금이 완료되었습니다");
            System.out.println("잔고 : " + account.getBalance());
        }
        //현재 계좌 잔액을 getter로 불러와서 예금액(money)를 더한 후
        //setBalance로 더한 금액을 넣기
    }//END withdraw


    private static Account findAccount(String ano){
        Account account = null;//비어있는 객체를 만든다 (반환되는 내용을 담아갈 객체)
        for(int i = 0; i< accountArray.length; i++){
            if(accountArray[i] != null){
                String dbAno = accountArray[i].getAno();//배열의 계좌번호를 dbano대입
                if(dbAno.equals(ano)){
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }//END findAcocunt



}
