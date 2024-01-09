package poly.sol.pay1;

public abstract class PayStore {
    public static Pay findPay(String option) {// 새 페이가 추가되면 여기만 변경한다.
        if(option.equals("kakao")){
            return new KaKaoPay();
        }else if(option.equals("naver")){
            return new NaverPay();
        }else{
            return new DefaultPay();
        }
    }
}
