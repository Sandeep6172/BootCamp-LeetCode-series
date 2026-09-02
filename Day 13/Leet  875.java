int end = 0;
        int start = 1;
        int result = 0;
        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long total = 0;
            for (int pile : piles) {
                total += pile / mid;
                if (pile % mid != 0) {
                    total++;
                }
            }
            if (total <= h) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
