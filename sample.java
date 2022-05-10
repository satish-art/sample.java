
Timer timer = new Timer();
timer.schedule(new TimerTask() {
  @Override
  public void run() {
    //what you want to do
  }
}, 0, 1000);//wait 0 ms before doing the action and do it evry 1000ms (1second)

timer.cancel();//stop the timer
