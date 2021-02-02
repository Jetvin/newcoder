package com.example.demo.service;

public class HJ40 {
    // 动态规划

    /**
     * 题目描述
     * 王强今天很开心，公司发给N元的年终奖。王强决定把年终奖用于购物，他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，下表就是一些主件与附件的例子：
     *
     * 主件	附件
     * 电脑	打印机，扫描仪
     * 书柜	图书
     * 书桌	台灯，文具
     * 工作椅	无
     *
     * 如果要买归类为附件的物品，必须先买该附件所属的主件。每个主件可以有 0 个、 1 个或 2 个附件。附件不再有从属于自己的附件。王强想买的东西很多，为了不超出预算，他把每件物品规定了一个重要度，分为 5 等：用整数 1 ~ 5 表示，第 5 等最重要。他还从因特网上查到了每件物品的价格（都是 10 元的整数倍）。他希望在不超过 N 元（可以等于 N 元）的前提下，使每件物品的价格与重要度的乘积的总和最大。
     *     设第 j 件物品的价格为 v[j] ，重要度为 w[j] ，共选中了 k 件物品，编号依次为 j 1 ， j 2 ，……， j k ，则所求的总和为：
     * v[j 1 ]*w[j 1 ]+v[j 2 ]*w[j 2 ]+ … +v[j k ]*w[j k ] 。（其中 * 为乘号）
     *     请你帮助王强设计一个满足要求的购物单。
     *
     *
     *
     *
     * 输入描述:
     *
     * 输入的第 1 行，为两个正整数，用一个空格隔开：N m
     * （其中 N （ <32000 ）表示总钱数， m （ <60 ）为希望购买物品的个数。）
     *
     *
     * 从第 2 行到第 m+1 行，第 j 行给出了编号为 j-1 的物品的基本数据，每行有 3 个非负整数 v p q
     *
     *
     * （其中 v 表示该物品的价格（ v<10000 ）， p 表示该物品的重要度（ 1 ~ 5 ）， q 表示该物品是主件还是附件。如果 q=0 ，表示该物品为主件，如果 q>0 ，表示该物品为附件， q 是所属主件的编号）
     *
     *
     *
     *
     * 输出描述:
     *
     *  输出文件只有一个正整数，为不超过总钱数的物品的价格与重要度乘积的总和的最大值（ <200000 ）。
     *
     * 示例1
     * 输入
     * 复制
     *
     * 1000 5
     * 800 2 0
     * 400 5 1
     * 300 5 1
     * 400 3 0
     * 500 2 0
     *
     * 输出
     * 复制
     *
     * 2200
     */

    /**
     * 题目描述
     *
     * 计算最少出列多少位同学，使得剩下的同学排成合唱队形
     *
     * 说明：
     *
     * N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
     * 合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
     * 你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
     *
     *
     * 注意不允许改变队列元素的先后顺序
     * 请注意处理多组输入输出！
     *
     *
     * 输入描述:
     *
     * 整数N
     *
     * 输出描述:
     *
     * 最少需要几位同学出列
     *
     * 示例1
     * 输入
     * 复制
     *
     * 8
     * 186 186 150 200 160 130 197 200
     *
     * 输出
     * 复制
     *
     * 4
     */

    /**
     * 题目描述
     *
     * 题目描述
     *
     * 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1 是同一种分法。
     * 数据范围：0<=m<=10，1<=n<=10。
     *
     * 本题含有多组样例输入。
     *
     *
     * 输入描述:
     *
     * 输入两个int整数
     *
     * 输出描述:
     *
     * 输出结果，int型
     *
     * 示例1
     * 输入
     * 复制
     *
     * 7 3
     *
     * 输出
     * 复制
     *
     * 8
     */

    // 哈希
    /**
     * 题目描述
     * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
     * 例如，对于字符串abaca而言，有a、b、c三种不同的字符，因此输出3。
     * 输入描述:
     *
     * 输入一行没有空格的字符串。
     *
     * 输出描述:
     *
     * 输出范围在(0~127)字符的个数。
     *
     * 示例1
     * 输入
     * 复制
     *
     * abc
     *
     * 输出
     * 复制
     *
     * 3
     */

    /**
     * 题目描述
     * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
     * 保证输入的整数最后一位不是0。
     * 输入描述:
     *
     * 输入一个int型整数
     *
     * 输出描述:
     *
     * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
     *
     * 示例1
     * 输入
     * 复制
     *
     * 9876673
     *
     * 输出
     * 复制
     *
     * 37689
     */

    // 队列
    /**
     * 题目描述(队列、链表、栈、字符串)
     *
     * 现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此不需要用正号出现），如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。
     * 现在需要你用程序来判断IP是否合法。
     *
     * 注意本题有多组样例输入。
     *
     *
     * 输入描述:
     *
     * 输入一个ip地址，保证是xx.xx.xx.xx的形式（xx为整数）
     *
     * 输出描述:
     *
     * 返回判断的结果YES or NO
     *
     * 示例1
     * 输入
     * 复制
     *
     * 10.138.15.1
     * 255.0.0.255
     * 255.255.255.1000
     *
     * 输出
     * 复制
     *
     * YES
     * YES
     * NO
     */

    // 栈
    /**
     * 题目描述
     * 给定一个正整数N代表火车数量，0<N<10，接下来输入火车入站的序列，一共N辆火车，每辆火车以数字1-9编号，火车站只有一个方向进出，同时停靠在火车站的列车中，只有后进站的出站了，先进站的才能出站。
     * 要求输出所有火车出站的方案，以字典序排序输出。
     * 输入描述:
     *
     * 有多组测试用例，每一组第一行输入一个正整数N（0
     *
     * 输出描述:
     *
     * 输出以字典序从小到大排序的火车出站序列号，每个编号以空格隔开，每个输出序列换行，具体见sample。
     *
     * 示例1
     * 输入
     * 复制
     *
     * 3
     * 1 2 3
     *
     * 输出
     * 复制
     *
     * 1 2 3
     * 1 3 2
     * 2 1 3
     * 2 3 1
     * 3 2 1
     *
     * 说明
     *
     * 第一种方案：1进、1出、2进、2出、3进、3出
     * 第二种方案：1进、1出、2进、3进、3出、2出
     * 第三种方案：1进、2进、2出、1出、3进、3出
     * 第四种方案：1进、2进、2出、3进、3出、1出
     * 第五种方案：1进、2进、3进、3出、2出、1出
     * 请注意，[3,1,2]这个序列是不可能实现的。
     */

    /**
     * 题目描述
     * 输入一个表达式（用字符串表示），求这个表达式的值。
     *
     * 保证字符串中的有效字符包括[‘0’-‘9’],‘+’,‘-’, ‘*’,‘/’ ,‘(’， ‘)’,‘[’, ‘]’,‘{’ ,‘}’。且表达式一定合法。
     *
     *
     *
     * 输入描述:
     *
     * 输入一个算术表达式
     *
     * 输出描述:
     *
     * 得到计算结果
     *
     * 示例1
     * 输入
     * 复制
     *
     * 3+2*{1+2*[-4/(8-6)+7]}
     *
     * 输出
     * 复制
     *
     * 25
     */

    // 链表
    /**
     * 题目描述
     *
     * 输入一个单向链表和一个节点的值，从单向链表中删除等于该值的节点，删除后如果链表中无节点则返回空指针。
     *
     * 链表的值不能重复。
     *
     * 构造过程，例如
     *
     * 1 <- 2
     *
     * 3 <- 2
     *
     * 5 <- 1
     *
     * 4 <- 5
     *
     * 7 <- 2
     *
     * 最后的链表的顺序为 2 7 3 1 5 4
     *
     * 删除 结点 2
     *
     * 则结果为 7 3 1 5 4
     * 链表长度不大于1000，每个节点的值不大于10000。
     * 本题含有多组样例。
     *
     *
     * 输入描述:
     *
     * 1 输入链表结点个数
     * 2 输入头结点的值
     * 3 按照格式插入各个结点
     * 4 输入要删除的结点的值
     *
     * 输出描述:
     *
     * 输出删除结点后的序列，每个数后都要加空格
     *
     * 示例1
     * 输入
     * 复制
     *
     * 5
     * 2
     * 3 2
     * 4 3
     * 5 2
     * 1 4
     * 3
     *
     * 输出
     * 复制
     *
     * 2 5 4 1
     */

    /**
     * 题目描述(队列、链表、栈、字符串)
     *
     * 扑克牌游戏大家应该都比较熟悉了，一副牌由54张组成，含3~A、2各4张，小王1张，大王1张。牌面从小到大用如下字符和字符串表示（其中，小写joker表示小王，大写JOKER表示大王）：
     * 3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER
     * 输入两手牌，两手牌之间用"-"连接，每手牌的每张牌以空格分隔，"-"两边没有空格，如：4 4 4 4-joker JOKER。
     * 请比较两手牌大小，输出较大的牌，如果不存在比较关系则输出ERROR。
     * 基本规则：
     * （1）输入每手牌可能是个子、对子、顺子（连续5张）、三个、炸弹（四个）和对王中的一种，不存在其他情况，由输入保证两手牌都是合法的，顺子已经从小到大排列；
     * （2）除了炸弹和对王可以和所有牌比较之外，其他类型的牌只能跟相同类型的存在比较关系（如，对子跟对子比较，三个跟三个比较），不考虑拆牌情况（如：将对子拆分成个子）；
     * （3）大小规则跟大家平时了解的常见规则相同，个子、对子、三个比较牌面大小；顺子比较最小牌大小；炸弹大于前面所有的牌，炸弹之间比较牌面大小；对王是最大的牌；
     *
     * （4）输入的两手牌不会出现相等的情况。
     *
     *
     *
     *
     *
     *
     * 输入描述:
     *
     * 输入两手牌，两手牌之间用"-"连接，每手牌的每张牌以空格分隔，"-"两边没有空格，如 4 4 4 4-joker JOKER。
     *
     * 输出描述:
     *
     * 输出两手牌中较大的那手，不含连接符，扑克牌顺序不变，仍以空格隔开；如果不存在比较关系则输出ERROR。
     *
     * 示例1
     * 输入
     * 复制
     *
     * 4 4 4 4-joker JOKER
     *
     * 输出
     * 复制
     *
     * joker JOKER
     */

    // 数组
    /**
     * 题目描述
     *
     * 输入n个整数，输出其中最小的k个。
     * 本题有多组输入样例，请使用循环读入，比如while(cin>>)等方式处理
     * 输入描述:
     *
     * 第一行输入两个整数n和k
     * 第二行输入一个整数数组
     *
     * 输出描述:
     *
     * 输出一个从小到大排序的整数数组
     *
     * 示例1
     * 输入
     * 复制
     *
     * 5 2
     * 1 3 5 7 2
     *
     * 输出
     * 复制
     *
     * 1 2
     */

    /**
     * 题目描述
     *
     * 题目标题：
     * 将两个整型数组按照升序合并，并且过滤掉重复数组元素。
     * 输出时相邻两数之间没有空格。
     * 请注意本题有多组样例。
     *
     *
     *
     * 输入描述:
     *
     * 输入说明，按下列顺序输入：
     * 1 输入第一个数组的个数
     * 2 输入第一个数组的数值
     * 3 输入第二个数组的个数
     * 4 输入第二个数组的数值
     *
     * 输出描述:
     *
     * 输出合并之后的数组
     *
     * 示例1
     * 输入
     * 复制
     *
     * 3
     * 1 2 5
     * 4
     * -1 0 3 2
     *
     * 输出
     * 复制
     *
     * -101235
     */

    /**
     * 题目描述
     *
     * 蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
     *
     * 例如，当输入5时，应该输出的三角形为：
     *
     * 1 3 6 10 15
     *
     * 2 5 9 14
     *
     * 4 8 13
     *
     * 7 12
     *
     * 11
     *
     * 请注意本题含有多组样例输入。
     *
     * 输入描述:
     *
     * 输入正整数N（N不大于100）
     *
     * 输出描述:
     *
     * 输出一个N行的蛇形矩阵。
     *
     * 示例1
     * 输入
     * 复制
     *
     * 4
     *
     * 输出
     * 复制
     *
     * 1 3 6 10
     * 2 5 9
     * 4 8
     * 7
     */
}