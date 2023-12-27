    public static int entryTime(String s, String keypad) {
        int time=0;
        
        for(int i=0; i<s.length()-1; i++){
            int crnt = keypad.indexOf(s.charAt(i));
            int next = keypad.indexOf(s.charAt(i+1));
            if(crnt==next)
                continue;
            else if(crnt == 0){
                if(next==1 || next==3 || next==4){
                    time++;
                    crnt=next;
                } else{
                    time+=2;
                    crnt=next;
                }
            }
            else if(crnt == 1){
                if(next==6 || next==7 || next==8){
                    time+=2;
                    crnt=next;
                } else{
                    time++;
                    crnt=next;
                }
            }
            else if(crnt == 2){
                if(next==1 || next==5 || next==4){
                    time++;
                    crnt=next;
                } else{
                    time+=2;
                    crnt=next;
                }
            }
            else if(crnt == 3){
                if(next==2 || next==5 || next==8){
                    time+=2;
                    crnt=next;
                } else{
                    time++;
                    crnt=next;
                }
            }
            else if(crnt == 4){
                time++;
                crnt=next;
                
            }
            else if(crnt == 5){
                if(next==0 || next==3 || next==6){
                    time+=2;
                    crnt=next;
                } else{
                    time++;
                    crnt=next;
                }
            }
            else if(crnt == 6){
                if(next==3 || next==4 || next==7){
                    time++;
                    crnt=next;
                } else{
                    time+=2;
                    crnt=next;
                }
            }
            else if(crnt == 7){
                if(next==0 || next==1 || next==2){
                    time+=2;
                    crnt=next;
                } else{
                    time++;
                    crnt=next;
                }
            }
            else if(crnt == 8){
                if(next==7 || next==4 || next==5){
                    time++;
                    crnt=next;
                } else{
                    time+=2;
                    crnt=next;
                }
            }     
        }
        return time;
    }