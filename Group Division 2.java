    public static int groupDivision(List<Integer> levels, int maxSpread) {
      int n = levels.size();
        int[] skillLevels = new int[n];
        for (int i = 0; i < n; i++) 
        {
        skillLevels[i] = levels.get(i);
        }

        Arrays.sort(skillLevels);
        int classes = 0;
        int firstGroup[] = new int[] { skillLevels[0] };
        for (int i = 0; i < n; i++) 
        {
        if (skillLevels[i] - firstGroup[0] > maxSpread) {
        classes++;
        firstGroup = new int[] { skillLevels[i] };
        } else {
        firstGroup = Arrays.copyOf(firstGroup, firstGroup.length + 1);
        firstGroup[firstGroup.length - 1] = skillLevels[i];
        }

        }

        classes++;

        return classes;
    }