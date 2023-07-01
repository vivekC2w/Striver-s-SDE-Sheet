# Brute Force Solution
# calculate every single possible path staring from start point to end point Among all this path we pick max probability
# not efficient its sort of back tracking approach where every time we visit a node we're gonna have a choices that is total number of choices
# equal to number of edges let's say the is 'E'. We are going to try to get every possible path in the graph so the length of path going to be 'V'
# where V is no of nodes in graph. This is going to be exponensial time complexity => E^(V)

# //Better Way
# //Hint: Weight are always going to be in between 0 and 1
# //Greedy Algorithm we can run in this case is shortest path algo ->>> Dijiktras Algo
# //Instead of finding shortest path we will find max probability
# //Time Complexity E*log(V)

class Solution:
    def maxProbability(self, n: int, edges: List[List[int]], succProb: List[float], start: int, end: int) -> float:
        adj = collections.defaultdict(list)
        for i in range(len(edges)):
            src, dst = edges[i]
            adj[src].append([dst, succProb[i]])
            adj[dst].append([src, succProb[i]])

        pq = [(-1, start)]
        visit = set()

        while pq:
            prob, cur = heapq.heappop(pq)
            visit.add(cur)

            if cur == end:
                return prob * -1
            for nei, edgeProb in adj[cur]:
                if nei not in visit:
                    heapq.heappush(pq, (prob * edgeProb, nei))
        return 0;
