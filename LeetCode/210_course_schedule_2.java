class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < numCourses ; i++){
            adj.add(new ArrayList<>());
        }

        int indegree[] = new int[numCourses];
        for(int[] prerequisite : prerequisites){
            int course = prerequisite[0];
            int pre = prerequisite[1];
            adj.get(pre).add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < numCourses ; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int order[] = new int[numCourses];
        int index = 0;
        
        while(!queue.isEmpty()){
            int course = queue.poll();
            order[index++] = course;

            for(int neighbor : adj.get(course)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0){
                    queue.add(neighbor);
                }
            }
        }

        if(index == numCourses){
            return order;
        }
        else{
            return new int[0];
        }
    }
}
