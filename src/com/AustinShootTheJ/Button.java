package com.AustinShootTheJ;

// example for local classes not used as often as anon classes because this will
// only allow us to set one instance of it. EX: if used as an onclick listener
// every click on screen will perform the same action.


public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;

    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener{
        public void onClick(String title);
    }

}
