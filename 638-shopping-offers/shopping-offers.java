public class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        List<List<Integer>> validSpecial = new ArrayList<>();
        for (List<Integer> offer : special) {
            int normalPrice = 0;
            for (int i = 0; i < price.size(); i++) {
                normalPrice += offer.get(i) * price.get(i);
            }
            int offerPrice = offer.get(offer.size() - 1);
            if (offerPrice < normalPrice) {
                validSpecial.add(offer);
            }
        }

        Map<List<Integer>, Integer> memo = new HashMap<>();
        return dfs(price, validSpecial, needs, memo);
    }

    private int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, Map<List<Integer>, Integer> memo) {
        if (memo.containsKey(needs)) {
            return memo.get(needs);
        }
        int minCost = 0;
        for (int i = 0; i < needs.size(); i++) {
            minCost += needs.get(i) * price.get(i);
        }
        for (List<Integer> offer : special) {
            List<Integer> updatedNeeds = new ArrayList<>();
            boolean isValidOffer = true;

            for (int i = 0; i < needs.size(); i++) {
                int remaining = needs.get(i) - offer.get(i);
                if (remaining < 0) {
                    isValidOffer = false;
                    break;
                }
                updatedNeeds.add(remaining);
            }
            if (isValidOffer) {
                int offerPrice = offer.get(offer.size() - 1);
                minCost = Math.min(minCost, offerPrice + dfs(price, special, updatedNeeds, memo));
            }
        }

        memo.put(needs, minCost);
        return minCost;
    }
}