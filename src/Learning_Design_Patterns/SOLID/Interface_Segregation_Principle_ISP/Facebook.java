package Learning_Design_Patterns.SOLID.Interface_Segregation_Principle_ISP;

public class Facebook implements SocialMedia,PostManager{
    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void chatWithFriend() {

    }

    @Override
    public void sendPhoto() {

    }
}