package leetcode;

public class leetcode35 {
    public static void main(String[] args) {
        int[] numsIn = new int[]{-5000,-4999,-4998,-4997,-4996,-4995,-4990,-4989,-4988,-4986,-4982,-4980,-4979,-4977,-4976,-4975,-4974,-4973,-4972,-4969,-4968,-4966,-4965,-4964,-4963,-4961,-4959,-4957,-4956,-4955,-4952,-4949,-4947,-4946,-4945,-4944,-4943,-4942,-4941,-4940,-4939,-4938,-4937,-4933,-4929,-4928,-4927,-4925,-4924,-4923,-4922,-4921,-4920,-4919,-4918,-4917,-4916,-4915,-4913,-4912,-4910,-4908,-4907,-4906,-4905,-4903,-4902,-4900,-4899,-4898,-4895,-4892,-4891,-4889,-4887,-4885,-4884,-4883,-4880,-4879,-4878,-4877,-4876,-4875,-4874,-4872,-4871,-4869,-4867,-4865,-4864,-4862,-4861,-4860,-4859,-4858,-4857,-4855,-4854,-4853,-4852,-4850,-4849,-4847,-4846,-4845,-4844,-4842,-4840,-4839,-4837,-4836,-4835,-4834,-4832,-4829,-4828,-4827,-4826,-4824,-4823,-4821,-4819,-4818,-4816,-4815,-4814,-4812,-4805,-4804,-4803,-4802,-4801,-4800,-4796,-4793,-4792,-4791,-4790,-4788,-4787,-4786,-4785,-4784,-4781,-4779,-4778,-4777,-4776,-4775,-4774,-4773,-4772,-4771,-4769,-4765,-4764,-4763,-4762,-4760,-4759,-4757,-4756,-4755,-4754,-4753,-4750,-4749,-4748,-4747,-4745,-4744,-4741,-4740,-4739,-4734,-4733,-4731,-4729,-4728,-4727,-4723,-4721,-4720,-4718,-4716,-4715,-4712,-4711,-4710,-4709,-4707,-4706,-4705,-4699,-4698,-4696,-4695,-4692,-4691,-4690,-4689,-4688,-4687,-4686,-4685,-4683,-4682,-4680,-4679,-4678,-4677,-4671,-4670,-4669,-4668,-4667,-4665,-4664,-4663,-4662,-4661,-4659,-4658,-4657,-4654,-4651,-4650,-4649,-4648,-4647,-4646,-4645,-4644,-4642,-4641,-4638,-4636,-4635,-4634,-4630,-4629,-4628,-4626,-4624,-4623,-4622,-4621,-4620,-4619,-4617,-4616,-4615,-4614,-4612,-4611,-4610,-4608,-4603,-4602,-4601,-4600,-4598,-4596,-4594,-4593,-4590,-4585,-4584,-4583,-4582,-4580,-4579,-4574,-4573,-4572,-4570,-4569,-4568,-4567,-4566,-4565,-4564,-4563,-4561,-4560,-4559,-4558,-4557,-4554,-4553,-4552,-4549,-4548,-4547,-4546,-4542,-4541,-4540,-4539,-4536,-4531,-4530,-4529,-4528,-4527,-4526,-4525,-4524,-4523,-4522,-4521,-4519,-4517,-4514,-4513,-4512,-4511,-4510,-4509,-4508,-4507,-4506,-4505,-4504,-4503,-4502,-4501,-4500,-4498,-4497,-4496,-4495,-4494,-4493,-4491,-4489,-4487,-4486,-4485,-4482,-4481,-4480,-4478,-4476,-4474,-4472,-4471,-4470,-4469,-4468,-4466,-4465,-4464,-4463,-4462,-4461,-4460,-4459,-4457,-4455,-4453,-4452,-4451,-4450,-4449,-4448,-4447,-4445,-4443,-4442,-4441,-4440,-4438,-4434,-4432,-4431,-4429,-4427,-4426,-4425,-4420,-4418,-4417,-4416,-4414,-4412,-4410,-4409,-4407,-4405,-4403,-4402,-4400,-4398,-4397,-4395,-4394,-4392,-4390,-4389,-4388,-4386,-4384,-4382,-4380,-4379,-4378,-4377,-4376,-4375,-4374,-4373,-4372,-4371,-4370,-4369,-4368,-4367,-4366,-4365,-4364,-4362,-4360,-4359,-4357,-4356,-4355,-4353,-4352,-4351,-4350,-4348,-4346,-4343,-4342,-4339,-4338,-4337,-4335,-4334,-4333,-4330,-4329,-4327,-4326,-4325,-4321,-4320,-4318,-4317,-4316,-4315,-4314,-4313,-4312,-4311,-4308,-4306,-4302,-4301,-4297,-4296,-4295,-4293,-4292,-4291,-4290,-4289,-4288,-4287,-4286,-4285,-4284,-4283,-4280,-4279,-4278,-4277,-4275,-4274,-4273,-4272,-4270,-4269,-4267,-4265,-4264,-4261,-4259,-4257,-4254,-4252,-4251,-4250,-4248,-4247,-4246,-4245,-4244,-4243,-4242,-4241,-4240,-4238,-4236,-4235,-4234,-4232,-4231,-4224,-4223,-4221,-4220,-4219,-4218,-4216,-4214,-4212,-4211,-4210,-4207,-4206,-4204,-4203,-4202,-4201,-4199,-4197,-4196,-4195,-4194,-4193,-4192,-4191,-4190,-4188,-4185,-4182,-4180,-4179,-4178,-4176,-4173,-4172,-4170,-4168,-4167,-4165,-4164,-4163,-4162,-4155,-4154,-4153,-4152,-4151,-4148,-4147,-4145,-4144,-4143,-4142,-4138,-4135,-4133,-4132,-4131,-4130,-4129,-4128,-4127,-4125,-4121,-4120,-4119,-4118,-4116,-4113,-4112,-4108,-4105,-4104,-4103,-4102,-4101,-4100,-4099,-4096,-4094,-4091,-4090,-4089,-4088,-4085,-4084,-4083,-4082,-4080,-4070,-4068,-4067,-4063,-4059,-4058,-4057,-4056,-4054,-4053,-4050,-4049,-4047,-4046,-4044,-4043,-4042,-4041,-4040,-4038,-4035,-4031,-4030,-4029,-4027,-4026,-4023,-4022,-4021,-4020,-4019,-4016,-4015,-4014,-4011,-4010,-4008,-4006,-4005,-4004,-4003,-4001,-3996,-3995,-3994,-3993,-3991,-3990,-3989,-3987,-3984,-3983,-3982,-3980,-3979,-3976,-3975,-3974,-3972,-3969,-3967,-3966,-3965,-3964,-3963,-3962,-3961,-3959,-3958,-3956,-3955,-3953,-3952,-3949,-3947,-3944,-3941,-3940,-3939,-3938,-3937,-3934,-3931,-3930,-3929,-3928,-3927,-3925,-3924,-3922,-3921,-3920,-3919,-3918,-3916,-3913,-3912,-3910,-3907,-3906,-3904,-3903,-3901,-3898,-3897,-3896,-3895,-3892,-3891,-3889,-3888,-3887,-3885,-3884,-3883,-3882,-3879,-3878,-3877,-3876,-3875,-3873,-3872,-3871,-3870,-3869,-3868,-3865,-3864,-3862,-3861,-3860,-3859,-3858,-3857,-3856,-3854,-3853,-3851,-3850,-3849,-3848,-3847,-3846,-3844,-3842,-3840,-3839,-3837,-3834,-3833,-3831,-3829,-3828,-3825,-3823,-3820,-3819,-3817,-3816,-3814,-3813,-3812,-3811,-3810,-3809,-3808,-3807,-3806,-3805,-3804,-3802,-3799,-3798,-3796,-3795,-3793,-3791,-3790,-3789,-3788,-3787,-3786,-3785,-3784,-3783,-3781,-3780,-3776,-3775,-3774,-3772,-3768,-3767,-3766,-3765,-3763,-3761,-3759,-3755,-3754,-3751,-3750,-3747,-3745,-3742,-3741,-3739,-3737,-3736,-3735,-3734,-3732,-3731,-3729,-3727,-3726,-3725,-3724,-3723,-3722,-3720,-3719,-3718,-3717,-3716,-3715,-3713,-3711,-3709,-3708,-3706,-3705,-3703,-3698,-3695,-3694,-3693,-3692,-3687,-3685,-3681,-3680,-3679,-3677,-3676,-3673,-3670,-3669,-3668,-3666,-3665,-3660,-3659,-3657,-3654,-3653,-3651,-3650,-3642,-3639,-3635,-3634,-3630,-3628,-3626,-3623,-3621,-3618,-3617,-3615,-3614,-3613,-3612,-3609,-3608,-3606,-3601,-3600,-3598,-3597,-3596,-3594,-3593,-3591,-3590,-3588,-3587,-3585,-3583,-3581,-3579,-3578,-3576,-3573,-3572,-3570,-3569,-3566,-3564,-3563,-3562,-3561,-3558,-3556,-3553,-3550,-3549,-3548,-3547,-3546,-3544,-3543,-3541,-3540,-3537,-3536,-3534,-3532,-3530,-3529,-3528,-3527,-3526,-3525,-3523,-3522,-3521,-3520,-3519,-3518,-3517,-3516,-3515,-3514,-3513,-3510,-3509,-3508,-3507,-3504,-3502,-3500,-3499,-3498,-3497,-3495,-3494,-3493,-3492,-3491,-3490,-3488,-3487,-3486,-3482,-3481,-3480,-3479,-3478,-3477,-3475,-3473,-3472,-3470,-3469,-3466,-3465,-3464,-3463,-3461,-3460,-3459,-3458,-3455,-3453,-3452,-3450,-3448,-3447,-3446,-3444,-3442,-3441,-3438,-3437,-3436,-3434,-3433,-3432,-3431,-3430,-3429,-3428,-3427,-3426,-3425,-3424,-3423,-3420,-3419,-3417,-3416,-3414,-3413,-3412,-3411,-3410,-3409,-3407,-3406,-3405,-3404,-3400,-3399,-3398,-3396,-3395,-3394,-3392,-3391,-3390,-3389,-3388,-3386,-3384,-3383,-3382,-3381,-3380,-3379,-3378,-3377,-3375,-3374,-3373,-3372,-3370,-3367,-3366,-3364,-3363,-3361,-3360,-3359,-3358,-3353,-3350,-3349,-3347,-3346,-3345,-3343,-3342,-3341,-3338,-3336,-3335,-3333,-3332,-3331,-3329,-3328,-3326,-3325,-3321,-3318,-3317,-3314,-3311,-3310,-3309,-3307,-3305,-3303,-3301,-3300,-3299,-3298,-3297,-3294,-3293,-3292,-3288,-3287,-3285,-3284,-3281,-3280,-3278,-3277,-3275,-3274,-3269,-3268,-3267,-3261,-3260,-3259,-3257,-3256,-3255,-3254,-3252,-3251,-3250,-3248,-3247,-3246,-3243,-3242,-3241,-3240,-3238,-3236,-3235,-3231,-3230,-3229,-3227,-3226,-3225,-3224,-3222,-3221,-3220,-3219,-3218,-3217,-3214,-3213,-3211,-3209,-3207,-3204,-3203,-3202,-3201,-3198,-3194,-3192,-3191,-3187,-3186,-3185,-3184,-3183,-3182,-3181,-3179,-3176,-3175,-3174,-3173,-3172,-3171,-3167,-3165,-3162,-3159,-3158,-3157,-3156,-3151,-3150,-3148,-3144,-3143,-3140,-3135,-3134,-3132,-3130,-3125,-3117,-3115,-3114,-3113,-3112,-3111,-3110,-3109,-3107,-3106,-3105,-3104,-3103,-3102,-3100,-3099,-3098,-3096,-3094,-3092,-3091,-3090,-3089,-3088,-3087,-3086,-3085,-3084,-3083,-3080,-3079,-3078,-3077,-3076,-3075,-3074,-3073,-3071,-3070,-3069,-3067,-3066,-3065,-3064,-3061,-3060,-3058,-3057,-3056,-3055,-3054,-3050,-3049,-3048,-3046,-3044,-3043,-3042,-3041,-3039,-3038,-3037,-3036,-3035,-3034,-3033,-3032,-3029,-3026,-3025,-3024,-3022,-3021,-3020,-3019,-3018,-3017,-3014,-3013,-3012,-3009,-3008,-3006,-3005,-3004,-3000,-2999,-2998,-2997,-2996,-2995,-2994,-2992,-2991,-2989,-2986,-2985,-2984,-2983,-2982,-2981,-2979,-2978,-2977,-2976,-2973,-2972,-2971,-2969,-2964,-2963,-2960,-2959,-2958,-2957,-2955,-2953,-2952,-2951,-2950,-2948,-2947,-2946,-2943,-2940,-2938,-2936,-2933,-2929,-2928,-2926,-2918,-2917,-2916,-2915,-2914,-2911,-2909,-2908,-2906,-2904,-2901,-2899,-2897,-2895,-2894,-2893,-2891,-2890,-2889,-2887,-2886,-2885,-2883,-2882,-2881,-2880,-2879,-2878,-2877,-2876,-2875,-2874,-2872,-2871,-2870,-2869,-2868,-2866,-2863,-2861,-2859,-2858,-2857,-2856,-2855,-2854,-2853,-2852,-2851,-2850,-2847,-2846,-2845,-2842,-2841,-2840,-2838,-2837,-2835,-2834,-2832,-2831,-2829,-2826,-2824,-2823,-2821,-2818,-2815,-2813,-2812,-2811,-2810,-2808,-2807,-2803,-2800,-2798,-2797,-2791,-2790,-2789,-2788,-2786,-2783,-2782,-2780,-2779,-2778,-2777,-2776,-2775,-2774,-2772,-2771,-2770,-2769,-2768,-2767,-2765,-2764,-2761,-2758,-2757,-2756,-2755,-2753,-2749,-2748,-2747,-2746,-2744,-2741,-2738,-2737,-2736,-2734,-2733,-2732,-2731,-2730,-2727,-2726,-2723,-2721,-2717,-2715,-2713,-2711,-2710,-2709,-2708,-2707,-2706,-2705,-2704,-2703,-2700,-2699,-2698,-2696,-2695,-2693,-2692,-2690,-2688,-2687,-2686,-2685,-2683,-2682,-2679,-2677,-2676,-2675,-2674,-2672,-2670,-2666,-2665,-2662,-2660,-2659,-2656,-2655,-2654,-2653,-2652,-2650,-2648,-2647,-2645,-2644,-2643,-2641,-2639,-2638,-2637,-2636,-2634,-2631,-2630,-2625,-2624,-2623,-2618,-2616,-2614,-2613,-2612,-2610,-2609,-2608,-2607,-2606,-2605,-2604,-2602,-2599,-2598,-2597,-2596,-2594,-2593,-2591,-2590,-2588,-2587,-2586,-2585,-2584,-2583,-2581,-2580,-2579,-2577,-2575,-2572,-2571,-2568,-2567,-2562,-2561,-2559,-2556,-2554,-2553,-2550,-2549,-2548,-2547,-2544,-2542,-2541,-2540,-2539,-2538,-2536,-2535,-2534,-2532,-2530,-2529,-2526,-2525,-2524,-2522,-2521,-2520,-2519,-2518,-2517,-2515,-2513,-2512,-2511,-2510,-2508,-2507,-2506,-2505,-2504,-2503,-2501,-2500,-2499,-2498,-2497,-2494,-2492,-2491,-2490,-2489,-2488,-2486,-2484,-2483,-2482,-2481,-2480,-2479,-2477,-2476,-2475,-2474,-2472,-2471,-2469,-2468,-2466,-2463,-2460,-2459,-2457,-2453,-2452,-2451,-2449,-2445,-2444,-2442,-2441,-2440,-2437,-2433,-2432,-2430,-2428,-2423,-2421,-2420,-2418,-2417,-2415,-2413,-2412,-2411,-2410,-2408,-2407,-2406,-2404,-2403,-2401,-2399,-2398,-2396,-2395,-2393,-2391,-2389,-2388,-2386,-2384,-2383,-2381,-2380,-2379,-2378,-2377,-2376,-2375,-2374,-2373,-2370,-2366,-2365,-2363,-2360,-2359,-2358,-2356,-2355,-2353,-2352,-2351,-2350,-2347,-2346,-2345,-2344,-2341,-2340,-2338,-2336,-2334,-2333,-2332,-2331,-2330,-2327,-2326,-2325,-2323,-2322,-2321,-2318,-2317,-2316,-2315,-2314,-2309,-2308,-2307,-2306,-2305,-2304,-2303,-2301,-2300,-2298,-2297,-2296,-2295,-2294,-2292,-2291,-2289,-2288,-2287,-2285,-2284,-2282,-2281,-2279,-2275,-2273,-2271,-2270,-2269,-2268,-2266,-2265,-2264,-2263,-2261,-2260,-2257,-2255,-2253,-2251,-2248,-2247,-2245,-2242,-2240,-2238,-2237,-2235,-2234,-2233,-2230,-2229,-2228,-2227,-2226,-2224,-2223,-2221,-2220,-2215,-2212,-2211,-2209,-2208,-2206,-2203,-2202,-2201,-2200,-2199,-2198,-2196,-2195,-2194,-2191,-2189,-2184,-2183,-2181,-2180,-2179,-2178,-2176,-2175,-2174,-2172,-2170,-2168,-2167,-2166,-2165,-2162,-2161,-2159,-2157,-2156,-2154,-2152,-2149,-2148,-2147,-2146,-2143,-2142,-2140,-2138,-2136,-2133,-2131,-2129,-2124,-2123,-2122,-2120,-2118,-2116,-2114,-2112,-2111,-2110,-2109,-2108,-2104,-2103,-2100,-2099,-2098,-2096,-2095,-2094,-2093,-2092,-2091,-2090,-2089,-2088,-2086,-2084,-2082,-2080,-2078,-2077,-2076,-2074,-2070,-2069,-2068,-2066,-2065,-2062,-2060,-2057,-2056,-2055,-2054,-2053,-2052,-2051,-2049,-2046,-2044,-2043,-2041,-2040,-2039,-2038,-2036,-2034,-2033,-2031,-2030,-2027,-2026,-2025,-2020,-2019,-2017,-2012,-2010,-2008,-2007,-2006,-2004,-2003,-2001,-2000,-1999,-1998,-1996,-1994,-1991,-1989,-1987,-1986,-1983,-1982,-1978,-1976,-1975,-1974,-1971,-1970,-1966,-1965,-1963,-1962,-1961,-1960,-1956,-1955,-1954,-1953,-1952,-1951,-1948,-1947,-1944,-1942,-1941,-1940,-1939,-1938,-1937,-1936,-1935,-1934,-1933,-1932,-1931,-1930,-1929,-1927,-1926,-1924,-1923,-1922,-1920,-1919,-1916,-1913,-1912,-1910,-1909,-1908,-1907,-1906,-1905,-1901,-1900,-1899,-1898,-1897,-1896,-1895,-1894,-1893,-1891,-1888,-1887,-1886,-1884,-1883,-1882,-1881,-1880,-1879,-1878,-1876,-1875,-1874,-1873,-1872,-1870,-1869,-1865,-1864,-1861,-1859,-1857,-1855,-1854,-1853,-1850,-1848,-1846,-1845,-1843,-1841,-1839,-1838,-1837,-1835,-1833,-1832,-1831,-1830,-1829,-1827,-1826,-1825,-1824,-1821,-1820,-1819,-1817,-1815,-1811,-1810,-1809,-1808,-1805,-1804,-1800,-1797,-1794,-1793,-1792,-1786,-1784,-1781,-1780,-1777,-1776,-1775,-1772,-1771,-1769,-1765,-1764,-1762,-1761,-1759,-1757,-1756,-1755,-1754,-1753,-1752,-1751,-1750,-1749,-1748,-1744,-1743,-1742,-1741,-1740,-1739,-1738,-1735,-1733,-1731,-1730,-1727,-1726,-1725,-1724,-1723,-1721,-1718,-1717,-1715,-1713,-1712,-1708,-1707,-1706,-1705,-1704,-1702,-1700,-1699,-1698,-1697,-1695,-1694,-1690,-1688,-1687,-1684,-1683,-1682,-1681,-1678,-1677,-1675,-1674,-1673,-1672,-1671,-1669,-1667,-1666,-1664,-1663,-1659,-1654,-1653,-1652,-1651,-1647,-1646,-1645,-1644,-1642,-1641,-1640,-1639,-1637,-1635,-1632,-1630,-1629,-1627,-1626,-1625,-1624,-1623,-1622,-1620,-1618,-1617,-1616,-1615,-1614,-1613,-1612,-1611,-1610,-1609,-1608,-1606,-1604,-1602,-1600,-1598,-1596,-1592,-1591,-1587,-1585,-1583,-1582,-1581,-1578,-1577,-1576,-1575,-1574,-1573,-1572,-1571,-1570,-1569,-1568,-1567,-1566,-1565,-1563,-1561,-1559,-1558,-1555,-1553,-1552,-1550,-1549,-1548,-1547,-1545,-1544,-1542,-1539,-1538,-1537,-1534,-1532,-1530,-1529,-1527,-1526,-1525,-1522,-1520,-1518,-1517,-1516,-1515,-1514,-1512,-1511,-1507,-1506,-1505,-1504,-1503,-1501,-1500,-1494,-1493,-1492,-1491,-1489,-1487,-1486,-1484,-1483,-1482,-1480,-1479,-1477,-1475,-1473,-1470,-1469,-1468,-1467,-1465,-1464,-1463,-1462,-1461,-1460,-1458,-1455,-1454,-1453,-1450,-1447,-1445,-1444,-1443,-1442,-1441,-1440,-1439,-1438,-1437,-1435,-1434,-1432,-1430,-1427,-1426,-1425,-1423,-1421,-1420,-1418,-1409,-1407,-1406,-1403,-1402,-1401,-1399,-1398,-1397,-1396,-1394,-1393,-1392,-1390,-1389,-1387,-1385,-1384,-1382,-1381,-1379,-1377,-1376,-1375,-1374,-1373,-1372,-1370,-1365,-1363,-1361,-1360,-1359,-1358,-1357,-1356,-1355,-1354,-1353,-1352,-1351,-1350,-1348,-1346,-1345,-1343,-1342,-1341,-1340,-1339,-1337,-1336,-1334,-1333,-1331,-1328,-1327,-1325,-1324,-1322,-1321,-1320,-1319,-1316,-1313,-1312,-1311,-1310,-1309,-1308,-1307,-1306,-1305,-1303,-1300,-1299,-1297,-1296,-1294,-1293,-1292,-1291,-1286,-1284,-1283,-1282,-1281,-1277,-1276,-1274,-1271,-1270,-1269,-1268,-1267,-1265,-1263,-1262,-1261,-1260,-1258,-1257,-1256,-1255,-1253,-1252,-1251,-1250,-1248,-1247,-1243,-1242,-1241,-1240,-1239,-1238,-1237,-1235,-1234,-1233,-1232,-1231,-1224,-1220,-1218,-1216,-1215,-1214,-1213,-1212,-1208,-1207,-1206,-1203,-1202,-1201,-1200,-1198,-1197,-1196,-1194,-1193,-1189,-1188,-1187,-1182,-1181,-1179,-1178,-1177,-1176,-1175,-1171,-1170,-1169,-1168,-1167,-1166,-1165,-1163,-1161,-1160,-1159,-1158,-1157,-1156,-1155,-1151,-1148,-1146,-1145,-1144,-1143,-1140,-1139,-1138,-1137,-1136,-1134,-1131,-1129,-1128,-1127,-1126,-1123,-1122,-1121,-1119,-1118,-1115,-1113,-1112,-1110,-1108,-1107,-1106,-1105,-1104,-1102,-1101,-1100,-1099,-1096,-1095,-1094,-1093,-1092,-1091,-1090,-1089,-1088,-1087,-1086,-1084,-1083,-1082,-1081,-1080,-1078,-1077,-1076,-1075,-1072,-1071,-1069,-1064,-1062,-1061,-1060,-1059,-1058,-1057,-1054,-1053,-1052,-1050,-1049,-1048,-1046,-1041,-1040,-1039,-1037,-1035,-1034,-1032,-1031,-1027,-1026,-1025,-1024,-1022,-1019,-1016,-1015,-1013,-1012,-1011,-1008,-1007,-1006,-1005,-1004,-1000,-999,-996,-995,-994,-993,-991,-990,-989,-987,-985,-984,-983,-980,-979,-978,-977,-975,-974,-973,-972,-971,-970,-967,-965,-964,-963,-962,-961,-960,-959,-954,-952,-951,-949,-948,-947,-946,-943,-941,-940,-939,-936,-933,-931,-928,-927,-925,-919,-918,-916,-913,-909,-908,-907,-906,-905,-904,-903,-901,-900,-899,-897,-889,-888,-887,-885,-884,-882,-880,-877,-876,-875,-874,-873,-872,-870,-869,-868,-867,-866,-865,-860,-859,-858,-857,-856,-855,-854,-852,-848,-846,-845,-844,-843,-842,-841,-840,-839,-838,-834,-831,-830,-828,-827,-824,-823,-822,-819,-817,-816,-814,-813,-811,-810,-809,-806,-805,-804,-802,-798,-796,-795,-794,-792,-789,-788,-787,-784,-783,-782,-781,-780,-777,-775,-774,-773,-772,-770,-769,-767,-764,-763,-761,-759,-757,-756,-755,-752,-751,-749,-747,-746,-744,-743,-742,-741,-737,-736,-734,-733,-729,-728,-727,-726,-725,-724,-723,-722,-720,-719,-718,-715,-714,-713,-712,-710,-709,-708,-707,-703,-702,-700,-698,-695,-694,-692,-691,-688,-687,-684,-683,-682,-681,-679,-676,-675,-673,-672,-671,-670,-669,-668,-666,-665,-664,-663,-661,-659,-657,-655,-652,-651,-650,-649,-648,-647,-646,-644,-642,-641,-639,-637,-636,-634,-633,-630,-626,-625,-620,-618,-617,-615,-613,-612,-607,-605,-601,-600,-596,-592,-591,-588,-587,-586,-585,-583,-582,-581,-579,-578,-575,-574,-573,-572,-571,-570,-567,-565,-563,-561,-560,-559,-558,-557,-556,-555,-554,-553,-552,-551,-550,-549,-548,-545,-544,-543,-541,-539,-538,-537,-536,-531,-530,-528,-527,-525,-523,-522,-521,-517,-516,-515,-512,-511,-508,-506,-505,-502,-501,-499,-498,-497,-496,-493,-492,-490,-489,-488,-484,-483,-482,-481,-479,-478,-475,-473,-472,-471,-468,-467,-466,-464,-463,-462,-461,-459,-458,-455,-453,-452,-448,-447,-445,-444,-441,-437,-436,-435,-432,-431,-430,-429,-428,-426,-424,-422,-421,-418,-417,-414,-413,-411,-410,-407,-406,-405,-404,-402,-401,-398,-397,-396,-395,-393,-391,-388,-385,-383,-382,-380,-379,-377,-376,-375,-374,-372,-370,-368,-365,-361,-359,-358,-357,-351,-350,-349,-348,-347,-346,-340,-339,-338,-337,-335,-333,-332,-330,-328,-327,-326,-325,-324,-323,-322,-319,-317,-316,-313,-312,-310,-307,-306,-305,-304,-302,-301,-299,-298,-297,-296,-294,-291,-290,-289,-288,-287,-286,-284,-283,-281,-278,-276,-275,-274,-273,-272,-271,-270,-265,-263,-262,-261,-260,-259,-258,-257,-256,-255,-254,-253,-252,-251,-249,-248,-247,-244,-242,-241,-240,-239,-238,-237,-235,-232,-231,-226,-223,-221,-218,-216,-215,-214,-212,-210,-208,-206,-204,-203,-202,-201,-200,-199,-197,-195,-194,-193,-192,-191,-190,-188,-186,-185,-181,-178,-177,-175,-174,-168,-166,-165,-164,-163,-161,-160,-159,-156,-153,-151,-147,-145,-144,-141,-140,-135,-134,-133,-131,-130,-129,-128,-126,-125,-124,-122,-119,-115,-113,-109,-108,-104,-102,-101,-95,-92,-91,-90,-89,-88,-87,-85,-82,-80,-79,-77,-74,-71,-69,-68,-67,-64,-63,-62,-61,-60,-59,-57,-56,-55,-54,-52,-51,-50,-49,-47,-45,-44,-43,-41,-39,-38,-37,-35,-34,-32,-27,-24,-21,-20,-17,-15,-14,-13,-12,-11,-10,-9,-8,-4,-3,-2,-1,0,1,2,3,5,7,12,13,14,15,16,17,18,21,25,27,30,34,35,36,37,38,39,40,42,43,44,48,49,50,51,52,55,57,58,59,61,64,67,68,69,70,72,73,76,77,78,79,80,82,83,85,86,87,89,91,92,94,96,98,100,103,104,105,106,107,111,112,114,115,116,117,118,119,121,123,124,125,127,130,131,132,133,134,136,137,139,140,142,143,144,145,146,147,148,149,151,152,153,154,155,159,160,161,164,165,166,167,168,169,171,172,173,175,176,177,178,179,180,181,182,183,189,190,191,192,194,196,199,202,203,204,205,206,207,210,211,213,215,216,218,219,221,222,224,225,227,228,229,230,238,239,240,241,242,243,244,251,255,256,257,259,260,261,263,264,265,266,268,269,271,272,273,274,276,277,279,280,282,283,284,285,286,289,291,292,295,296,297,299,300,301,303,305,308,309,311,312,313,314,316,317,322,326,329,330,333,334,336,337,339,341,342,343,345,346,347,348,352,353,355,358,361,363,364,365,366,367,370,371,372,373,374,375,376,379,380,381,382,383,384,386,387,389,390,391,392,395,397,400,402,404,407,409,410,411,412,413,414,415,416,417,418,421,425,427,429,430,433,434,435,438,440,441,442,444,445,446,448,449,451,452,453,454,455,456,458,459,460,462,463,465,468,469,472,473,475,476,477,478,479,481,482,484,486,487,489,490,491,495,497,498,499,500,502,503,504,505,507,508,509,511,512,514,515,516,517,518,520,521,522,523,525,528,529,530,531,535,536,537,543,545,547,548,549,554,557,558,559,560,561,562,564,565,566,567,568,570,572,573,574,575,577,578,580,581,582,583,585,587,588,589,590,592,593,595,598,600,601,602,605,606,607,608,610,612,613,615,617,621,622,624,625,626,627,628,629,630,631,635,636,637,638,640,641,642,643,647,649,650,652,655,656,659,661,662,663,665,666,668,669,670,671,672,673,676,678,679,680,681,682,683,685,687,688,689,692,693,694,695,697,699,700,701,702,703,704,705,706,708,710,711,712,715,717,719,720,722,723,726,731,734,735,736,738,741,744,745,746,747,748,749,752,753,755,756,757,758,760,761,762,763,764,767,768,769,770,771,774,775,776,777,779,781,782,784,785,789,791,793,794,795,797,798,799,800,801,802,803,804,805,808,809,812,813,814,815,816,817,818,819,822,826,829,830,831,832,833,834,836,838,839,840,842,844,846,847,848,849,850,852,854,855,856,857,858,862,865,868,873,874,875,877,878,879,880,881,882,883,884,885,890,892,894,896,897,900,901,902,908,909,910,912,913,915,916,917,918,919,920,921,925,926,929,930,931,932,934,935,936,937,938,939,941,943,944,945,948,949,950,951,952,953,955,956,957,958,959,961,962,963,965,966,969,971,972,973,974,978,981,982,984,985,987,988,989,991,992,993,995,996,997,1000,1001,1004,1005,1006,1007,1008,1009,1010,1012,1013,1014,1016,1017,1018,1021,1022,1023,1024,1025,1026,1027,1028,1030,1032,1034,1035,1037,1040,1045,1046,1048,1049,1050,1051,1053,1055,1058,1060,1061,1062,1064,1065,1067,1068,1070,1071,1072,1076,1079,1080,1083,1084,1085,1086,1088,1089,1092,1094,1095,1098,1099,1100,1101,1102,1103,1104,1106,1107,1108,1109,1110,1111,1112,1113,1114,1115,1116,1120,1121,1123,1124,1125,1126,1128,1129,1130,1132,1133,1134,1137,1139,1140,1142,1143,1144,1146,1147,1148,1149,1150,1151,1155,1157,1158,1161,1165,1166,1167,1169,1175,1176,1178,1179,1180,1182,1183,1186,1187,1189,1192,1196,1198,1199,1200,1202,1205,1206,1207,1210,1211,1212,1213,1216,1218,1221,1222,1223,1224,1225,1227,1232,1233,1235,1236,1237,1238,1242,1244,1246,1249,1250,1251,1252,1253,1254,1257,1258,1259,1260,1261,1262,1263,1264,1265,1266,1268,1269,1270,1271,1273,1275,1276,1277,1278,1279,1281,1282,1283,1284,1285,1287,1288,1290,1291,1293,1294,1295,1296,1297,1298,1299,1302,1303,1304,1305,1306,1307,1309,1310,1315,1317,1318,1319,1320,1322,1324,1327,1328,1329,1332,1334,1335,1336,1337,1338,1339,1341,1343,1344,1345,1347,1348,1349,1351,1352,1353,1354,1355,1356,1357,1358,1361,1363,1366,1368,1370,1371,1373,1374,1376,1380,1381,1385,1386,1388,1389,1390,1391,1392,1393,1395,1397,1398,1400,1401,1402,1403,1406,1407,1409,1410,1412,1413,1414,1415,1416,1418,1419,1420,1421,1426,1427,1428,1431,1432,1433,1435,1437,1438,1439,1440,1441,1442,1443,1444,1445,1446,1447,1449,1451,1452,1453,1454,1456,1457,1461,1464,1466,1468,1469,1470,1472,1475,1476,1478,1480,1482,1483,1486,1488,1490,1491,1492,1494,1495,1496,1497,1498,1499,1501,1502,1503,1504,1507,1508,1509,1510,1512,1514,1515,1516,1518,1522,1523,1525,1527,1528,1529,1531,1532,1533,1534,1535,1539,1540,1541,1543,1545,1546,1547,1548,1551,1552,1553,1557,1558,1560,1561,1563,1564,1565,1567,1568,1569,1570,1571,1572,1573,1574,1575,1576,1577,1578,1579,1581,1582,1583,1585,1586,1587,1588,1589,1591,1592,1593,1596,1597,1599,1601,1602,1603,1605,1606,1607,1608,1609,1610,1611,1612,1615,1616,1618,1619,1620,1622,1623,1624,1626,1629,1630,1632,1633,1634,1635,1637,1638,1641,1643,1644,1645,1646,1648,1650,1651,1652,1653,1655,1656,1658,1662,1666,1671,1672,1673,1674,1677,1678,1679,1680,1682,1684,1686,1688,1689,1690,1691,1692,1694,1696,1697,1698,1700,1701,1704,1705,1706,1707,1708,1711,1712,1715,1716,1717,1718,1720,1721,1723,1724,1726,1727,1733,1735,1736,1737,1742,1746,1748,1749,1751,1752,1753,1755,1756,1757,1758,1759,1760,1762,1763,1764,1765,1766,1767,1769,1773,1778,1779,1783,1786,1787,1789,1795,1796,1797,1798,1799,1800,1801,1802,1805,1806,1808,1809,1810,1811,1813,1814,1815,1817,1818,1819,1820,1823,1826,1827,1828,1829,1830,1831,1832,1834,1835,1836,1837,1838,1839,1840,1841,1843,1845,1846,1847,1851,1852,1853,1854,1855,1857,1858,1859,1861,1863,1867,1868,1869,1871,1873,1874,1875,1876,1879,1882,1884,1885,1886,1889,1890,1891,1892,1893,1894,1895,1896,1897,1898,1900,1904,1905,1907,1908,1909,1910,1915,1917,1920,1925,1926,1927,1929,1930,1931,1934,1935,1937,1939,1940,1941,1942,1945,1946,1948,1949,1950,1951,1952,1953,1954,1956,1957,1960,1962,1964,1965,1966,1968,1969,1971,1972,1975,1981,1982,1984,1987,1989,1994,1995,1996,1997,1999,2001,2003,2005,2006,2007,2008,2009,2010,2012,2014,2018,2019,2020,2022,2023,2024,2025,2030,2032,2034,2035,2036,2038,2040,2041,2042,2043,2044,2045,2046,2047,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2061,2062,2064,2065,2066,2069,2071,2074,2075,2076,2078,2079,2080,2083,2084,2085,2088,2091,2092,2094,2095,2096,2097,2098,2099,2102,2103,2104,2105,2106,2111,2112,2113,2114,2115,2116,2117,2120,2122,2123,2124,2126,2127,2129,2130,2131,2133,2134,2135,2136,2138,2141,2144,2146,2147,2149,2150,2154,2156,2157,2158,2159,2161,2163,2165,2166,2167,2170,2171,2173,2175,2177,2178,2180,2181,2182,2183,2184,2186,2188,2189,2190,2192,2194,2195,2196,2197,2198,2200,2202,2204,2205,2206,2208,2210,2211,2212,2213,2214,2215,2219,2220,2222,2225,2227,2234,2236,2237,2238,2241,2244,2248,2249,2250,2251,2252,2254,2255,2256,2257,2260,2261,2263,2264,2265,2268,2269,2271,2272,2273,2274,2275,2278,2280,2281,2285,2286,2287,2288,2289,2290,2291,2292,2293,2294,2296,2297,2298,2299,2300,2301,2302,2303,2304,2305,2307,2308,2311,2312,2313,2315,2318,2319,2320,2323,2325,2326,2329,2330,2331,2333,2334,2336,2340,2341,2342,2343,2344,2345,2346,2347,2348,2349,2350,2352,2353,2354,2355,2356,2357,2358,2360,2363,2365,2366,2367,2368,2374,2378,2379,2381,2382,2383,2385,2387,2388,2389,2390,2393,2394,2395,2396,2398,2399,2401,2404,2405,2408,2409,2410,2411,2412,2414,2419,2420,2421,2422,2424,2425,2426,2427,2428,2430,2432,2433,2434,2435,2437,2438,2441,2442,2443,2444,2446,2447,2448,2449,2454,2455,2458,2459,2460,2461,2463,2464,2465,2466,2468,2470,2471,2472,2473,2474,2479,2480,2481,2482,2483,2485,2486,2488,2489,2492,2493,2494,2495,2496,2497,2498,2499,2500,2502,2505,2509,2510,2512,2513,2514,2515,2516,2517,2518,2519,2520,2524,2526,2527,2529,2530,2531,2532,2535,2537,2541,2542,2543,2546,2547,2548,2549,2551,2554,2555,2556,2557,2558,2559,2560,2562,2563,2567,2568,2572,2574,2575,2577,2582,2583,2585,2586,2587,2588,2589,2590,2591,2592,2593,2595,2596,2597,2598,2599,2601,2602,2604,2605,2606,2609,2610,2612,2613,2614,2615,2618,2621,2624,2626,2628,2629,2630,2632,2633,2635,2636,2637,2638,2639,2641,2642,2644,2645,2647,2648,2650,2651,2654,2658,2659,2662,2663,2664,2665,2667,2668,2669,2671,2672,2673,2674,2675,2676,2677,2678,2679,2680,2681,2682,2683,2684,2687,2689,2691,2692,2693,2695,2698,2699,2702,2708,2709,2710,2712,2714,2716,2717,2718,2719,2722,2727,2731,2733,2734,2736,2737,2738,2739,2740,2741,2743,2744,2745,2746,2747,2749,2750,2751,2752,2753,2754,2755,2756,2759,2760,2762,2763,2765,2767,2769,2770,2771,2772,2773,2775,2776,2779,2781,2782,2783,2784,2785,2788,2789,2791,2792,2793,2794,2795,2801,2804,2806,2807,2808,2810,2811,2812,2813,2816,2817,2818,2820,2822,2824,2827,2828,2829,2830,2831,2832,2833,2834,2835,2836,2837,2838,2841,2843,2844,2847,2849,2851,2852,2853,2854,2855,2856,2858,2859,2860,2862,2865,2869,2872,2873,2875,2876,2877,2879,2881,2882,2883,2884,2885,2888,2890,2891,2893,2894,2895,2896,2897,2900,2901,2903,2904,2906,2907,2908,2909,2910,2911,2912,2914,2916,2917,2919,2920,2922,2924,2925,2927,2928,2929,2930,2931,2934,2935,2937,2938,2939,2940,2941,2942,2946,2948,2949,2950,2952,2953,2955,2956,2958,2959,2963,2966,2968,2972,2975,2978,2980,2981,2982,2983,2984,2987,2988,2989,2990,2991,2993,2995,2996,2997,3002,3004,3005,3008,3011,3012,3013,3017,3018,3019,3021,3022,3023,3024,3025,3027,3028,3029,3030,3032,3033,3035,3036,3037,3038,3040,3041,3042,3043,3044,3046,3050,3051,3052,3053,3058,3059,3060,3061,3063,3064,3066,3067,3072,3074,3075,3076,3077,3078,3080,3081,3082,3083,3084,3085,3088,3092,3093,3094,3095,3096,3097,3098,3099,3101,3102,3103,3104,3105,3106,3108,3109,3110,3111,3113,3114,3115,3118,3119,3123,3124,3125,3126,3127,3128,3130,3132,3135,3140,3141,3142,3143,3145,3146,3147,3149,3151,3152,3153,3154,3155,3157,3159,3160,3161,3162,3163,3164,3165,3168,3170,3175,3176,3179,3180,3181,3182,3183,3184,3187,3188,3189,3190,3191,3192,3193,3194,3195,3197,3200,3201,3202,3203,3204,3205,3206,3208,3209,3211,3212,3213,3215,3217,3218,3219,3221,3223,3224,3225,3228,3230,3231,3232,3234,3235,3239,3241,3242,3244,3245,3246,3247,3248,3250,3252,3253,3254,3256,3258,3260,3262,3264,3265,3267,3269,3270,3271,3272,3276,3279,3280,3282,3283,3284,3285,3286,3287,3289,3290,3291,3295,3296,3299,3302,3303,3304,3305,3307,3308,3309,3310,3311,3312,3313,3318,3319,3320,3323,3324,3326,3327,3328,3329,3330,3331,3332,3336,3337,3339,3340,3341,3342,3343,3345,3349,3350,3356,3357,3358,3359,3362,3364,3365,3367,3368,3369,3371,3372,3375,3376,3377,3379,3380,3381,3382,3384,3385,3386,3388,3391,3392,3393,3395,3397,3399,3402,3403,3404,3405,3407,3408,3409,3410,3412,3414,3415,3416,3417,3418,3420,3422,3423,3424,3426,3427,3428,3429,3430,3431,3432,3438,3439,3440,3441,3443,3445,3447,3450,3451,3453,3454,3455,3456,3457,3458,3459,3461,3462,3463,3464,3466,3468,3471,3472,3473,3474,3476,3478,3479,3480,3481,3485,3486,3487,3488,3489,3490,3491,3492,3493,3494,3495,3496,3497,3499,3501,3506,3507,3511,3513,3515,3517,3518,3519,3521,3522,3523,3524,3525,3526,3528,3529,3530,3531,3532,3533,3534,3535,3536,3539,3541,3543,3545,3548,3549,3551,3552,3553,3554,3555,3556,3557,3558,3559,3560,3567,3568,3573,3575,3576,3578,3579,3581,3582,3586,3587,3588,3590,3591,3592,3593,3594,3597,3599,3601,3602,3603,3604,3606,3608,3611,3612,3613,3615,3621,3622,3623,3624,3625,3626,3629,3630,3631,3633,3634,3639,3641,3642,3643,3644,3645,3647,3648,3649,3650,3651,3654,3655,3656,3658,3659,3661,3662,3663,3665,3667,3668,3669,3670,3671,3672,3673,3674,3676,3677,3678,3681,3682,3683,3686,3687,3688,3689,3690,3692,3693,3696,3697,3699,3701,3704,3705,3706,3707,3708,3709,3710,3711,3712,3713,3714,3715,3716,3719,3720,3721,3723,3724,3725,3726,3728,3729,3730,3731,3732,3733,3734,3736,3737,3738,3739,3740,3741,3742,3743,3744,3746,3747,3748,3750,3752,3754,3755,3756,3757,3758,3761,3762,3763,3764,3765,3767,3768,3769,3770,3772,3773,3775,3777,3778,3779,3781,3783,3784,3785,3786,3787,3788,3789,3790,3791,3793,3794,3795,3797,3798,3799,3800,3801,3802,3803,3806,3807,3809,3811,3812,3814,3815,3818,3820,3821,3823,3824,3827,3828,3830,3831,3833,3834,3835,3838,3839,3840,3841,3842,3843,3845,3846,3847,3849,3851,3852,3853,3854,3855,3856,3857,3861,3863,3864,3866,3867,3869,3870,3872,3873,3874,3875,3876,3877,3881,3883,3884,3885,3886,3887,3888,3889,3891,3894,3897,3901,3902,3903,3904,3905,3906,3907,3908,3909,3910,3912,3913,3914,3915,3916,3917,3918,3921,3922,3923,3924,3926,3927,3928,3929,3930,3931,3933,3934,3935,3936,3941,3942,3944,3945,3946,3947,3949,3953,3954,3955,3956,3957,3959,3961,3962,3964,3965,3966,3969,3971,3972,3973,3977,3979,3981,3984,3985,3986,3988,3989,3990,3991,3993,3995,3996,3998,3999,4000,4001,4002,4003,4006,4008,4009,4010,4011,4012,4014,4015,4018,4022,4023,4024,4028,4029,4032,4034,4035,4036,4037,4038,4039,4040,4041,4044,4045,4046,4048,4050,4051,4052,4056,4057,4059,4060,4062,4064,4068,4069,4071,4072,4073,4077,4078,4079,4080,4081,4082,4083,4084,4085,4087,4088,4089,4090,4092,4093,4094,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4110,4112,4114,4115,4116,4117,4120,4121,4122,4123,4124,4127,4128,4129,4132,4135,4136,4137,4139,4140,4141,4142,4144,4145,4146,4147,4150,4151,4152,4154,4156,4157,4158,4159,4160,4162,4163,4165,4166,4168,4169,4170,4174,4176,4178,4180,4181,4184,4185,4186,4187,4189,4191,4195,4196,4197,4198,4199,4200,4203,4204,4205,4207,4208,4210,4211,4212,4214,4215,4217,4220,4222,4223,4224,4225,4226,4227,4228,4230,4235,4236,4237,4238,4239,4241,4242,4243,4245,4246,4248,4249,4251,4252,4254,4257,4259,4262,4264,4266,4267,4268,4271,4273,4275,4276,4277,4278,4282,4283,4287,4288,4290,4292,4293,4294,4295,4298,4301,4303,4304,4305,4307,4308,4309,4310,4311,4312,4313,4314,4316,4319,4320,4321,4322,4323,4325,4327,4329,4330,4333,4334,4337,4338,4339,4341,4342,4343,4344,4345,4346,4347,4350,4351,4352,4353,4354,4355,4357,4358,4360,4361,4362,4363,4364,4365,4369,4370,4372,4373,4376,4379,4380,4383,4386,4388,4390,4391,4392,4393,4394,4395,4396,4399,4400,4402,4405,4408,4410,4412,4413,4414,4415,4418,4419,4422,4423,4424,4426,4427,4429,4430,4431,4432,4433,4434,4436,4437,4438,4440,4442,4443,4447,4448,4450,4451,4452,4454,4455,4456,4457,4459,4460,4461,4463,4465,4466,4467,4468,4469,4470,4471,4472,4474,4480,4481,4482,4483,4484,4486,4487,4489,4491,4493,4495,4497,4498,4499,4501,4502,4504,4505,4506,4507,4508,4509,4510,4511,4512,4515,4516,4517,4521,4522,4523,4524,4526,4528,4529,4530,4531,4532,4533,4537,4538,4539,4540,4543,4544,4547,4548,4549,4551,4552,4553,4554,4555,4556,4557,4559,4560,4561,4562,4564,4566,4568,4570,4571,4572,4573,4574,4575,4577,4578,4581,4582,4583,4584,4587,4588,4589,4590,4591,4592,4593,4594,4596,4597,4598,4601,4602,4604,4605,4606,4610,4614,4615,4616,4621,4622,4623,4624,4625,4628,4629,4630,4632,4634,4636,4639,4641,4642,4644,4647,4648,4649,4650,4651,4652,4654,4656,4658,4660,4661,4662,4663,4665,4666,4667,4669,4672,4673,4674,4678,4679,4680,4681,4682,4683,4685,4686,4687,4688,4689,4690,4693,4698,4699,4700,4701,4704,4705,4707,4709,4712,4713,4715,4716,4717,4720,4721,4722,4723,4724,4727,4731,4733,4735,4737,4738,4739,4740,4741,4742,4744,4745,4748,4749,4752,4754,4755,4756,4758,4759,4764,4769,4770,4772,4774,4775,4776,4777,4778,4779,4780,4781,4782,4784,4785,4787,4788,4790,4791,4793,4795,4796,4797,4798,4799,4800,4801,4802,4805,4806,4808,4811,4812,4813,4814,4815,4816,4818,4820,4823,4824,4825,4830,4831,4832,4834,4835,4837,4839,4841,4842,4845,4846,4848,4851,4853,4854,4857,4858,4859,4860,4861,4863,4866,4867,4869,4870,4871,4872,4873,4874,4875,4876,4877,4878,4879,4880,4881,4882,4883,4884,4885,4886,4887,4888,4889,4890,4891,4892,4893,4895,4896,4897,4898,4900,4901,4902,4903,4904,4905,4906,4907,4910,4911,4912,4914,4917,4920,4921,4922,4924,4925,4926,4927,4930,4932,4933,4934,4936,4937,4938,4939,4940,4942,4943,4944,4946,4947,4950,4951,4953,4955,4961,4962,4963,4964,4966,4967,4970,4971,4972,4973,4974,4981,4982,4983,4985,4986,4987,4988,4989,4990,4991,4993,4994,4996,4997,4998,4999};
        int targetIn = 1309;
        System.out.println(searchInsert(numsIn, targetIn));
        System.out.println("---------------------");
        System.out.println(betterSearchInsert(numsIn, targetIn));
    }

    public static int betterSearchInsert(int[] nums, int target) {
        int lb = 0;
        int ub = nums.length - 1;
        while (lb <= ub) {
            int i = (lb) + (ub-lb) / 2;
            // why not (lb + ub) / 2?
            // because in real world sometimes (start & end) are large value that can occur Integer overflow.
            //that why we use start + (end-start)/2.
            int curr = nums[i];
            if (curr == target) {
                return i;
            } else if (curr > target) {
                ub = i - 1;
            } else {
                lb = i + 1;
            }
        }
        return lb;
    }

    public static int searchInsert(int[] nums, int target) {
        // 二分法查找
        int i = (nums.length - 1) / 2;
        int lb = 0;
        int rb = nums.length - 1;
        while (true) {
            int curr = nums[i];
            if (curr == target) {return i;}
            int left; int right;
            if (i == 0) {left = Integer.MIN_VALUE;} else {
                left = nums[i - 1];
            }
            if (i == nums.length - 1) {right = Integer.MAX_VALUE;} else {
                right = nums[i + 1];
            }
            if (left < target && target < curr) {return i;}
            if (curr < target && target < right) {return i + 1;}
            if (target < curr) {
                rb = i;
                i = (lb == i - 1) ? lb : (lb + i) / 2;
            } else {
                lb = i;
                i = (rb == i + 1) ? rb : (i + rb) / 2;
            }
        }
    }
}
