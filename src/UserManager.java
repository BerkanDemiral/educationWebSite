public class UserManager {
    public void signingUp(User user){
        System.out.println(user.getFirstName()+ " adlı kullancı sisteme kaydedildi");
    }
    public void signingIn(User user){
        System.out.println(user.getFirstName()+ " adlı kullanıcı sisteme giriş yaptı");
    }

}
