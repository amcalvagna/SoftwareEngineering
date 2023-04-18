
class Start implements SpopState {

    @Override
    public SpopState user(String userName) {
        return new HaveUserName(userName);
    }

}
