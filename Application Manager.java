    public static List<String> getOpenApplications(List<String> commands) {
    // Write your code here
        List<String> tem = new ArrayList<>();
        for (String command : commands) {
            String[] parts = command.split(" ");
            String comm = parts[0];
            String app = (parts.length > 1) ? parts[1] : null;
 
            if ("open".equals(comm)) {
                tem.add(app);
            } else if ("close".equals(comm)) {
                int count = (parts.length > 1) ? Integer.parseInt(parts[1]) : 0;
                if(count > 0) {
                    while (count-- > 0 && !tem.isEmpty()) {
                        tem.remove(tem.size() - 1);
                    }
                }else{
                    tem.clear();
                }
            } else {
                tem.clear();
            }
        }
        return tem;

    }