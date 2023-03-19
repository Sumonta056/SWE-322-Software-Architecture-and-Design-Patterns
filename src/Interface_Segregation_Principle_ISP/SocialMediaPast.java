package Interface_Segregation_Principle_ISP;

public class SocialMediaPast {
    public abstract class SocialMedia {

        public abstract void chatWithFriend();

        public abstract void publishPost(Object post);

        public abstract void sendPhoto();

        public abstract void groupCall(String users);
    }

}
