package programmers.lv1.P250137;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxTime = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int hp = health;

        int lastTime = attacks[attacks.length-1][0];

        int attacksIndex = 0;
        int success = 0;

        for (int i = 1; i <= lastTime; i++) {
            if (i == attacks[attacksIndex][0]) {
                hp -= attacks[attacksIndex][1];
                success = 0;
                attacksIndex++;
            } else {
                hp = heal(health, hp, x);

                success++;
                if (success == maxTime) {
                    hp = heal(health, hp, y);
                    success = 0;
                }
            }
            if (hp <= 0) return -1;
        }

        return hp;
    }

    public int heal(int health, int hp, int add) {
        if (hp + add > health) return health;
        return hp + add;
    }
}
