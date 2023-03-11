package fun.angelive.array.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Jingxiang Bi
 * @date: 2022/12/28
 */
public class Solution2085 {
    public static void main(String[] args) {
        String[] words1 = {"okjeatukksdzoulpnulvrswu","ygysvpzyjijq","lbz","wvfthvqcswqokfckdzhm","oiheznbhdwxesbvfegcsimtc","fxiaodudpqqmicny","bnlwykbndlkwkl","witgcbqrprjamtnzhfajr","rmylwzjigriackktxryuhdjftpo","xtahwttwpxznuomwpcep","dfjsbkuqofsitvd","gq","hep","wlwzgmmmdhyeurqqitmnbur","fbmkwcfapuqtfa","oiqb","dfzgftinespotqqtefwg","hjdodcx","wbzokgecenrezakjez","aynthdsrvzxoymwp","llrrliyvodswhdopsaxcgrusuph","kngcjtdjhnnfatzglabhld","wpazipxhqtnqqhxbt","pmtsioabwrp","oxkbrovsd","oyqnbqvfnuuinyoerplnclhk","nkzvrxfjl","io","deueyvttxszlcnqxj","fuhhbhitfhvznsfmjnxnag","lbqd","qrpvcxxjsigzasn","wulvhgavbowdweslsxr","upnenvlwwrvyfiknlsuwukjy","rmdfpvrpbvdjcmvvrydyxkbi","kzhewuwtyfut","tw","uyrfywhxwswffyklufilqzwsrw","jys","qpubjbgpumexgg","btkyhmjwcrjmqpdozinfluknu","xutwrkhawny","dujsrtqnwadexekyplxcdoz","ggyuw","wjj","bohu","eajtsjctnrzjuwuoacs","ynxwphscai","udxnzs","frxtmxloazsbunfzhzzg","zeqjzgidbwl","ajmkbprrccgvchwhfea","idpbphdkuaokgyjyn","hiqjlerdoqfs","ahgeqkbtwugldlnhzy","kksqlovpy","mfzdqgiflnzkhnombuhiaemekxhkbv","qibdz","errkhr","yicomonaszlzzpvmrqvfihwix","upnkoflpciyjxmaxpkuz","watufqzpzexkvyogcgcs","prohoevihzpbmedeo","yokaz","q","lqwdkljzjwxlwnovjxmn","fcmeusim","uydozbgsyrtenyhxesoqm","cheobhjvhsixpstoknrnrsur","ldezkixoktge","zlokowmfgktrhzftocyaiqxx","pvlkbakrkzdr","cgdsunqektggvbgjeebyndhsyrrwq","fumbqxoola","fypvfygesbqk","lzkhemjjkypxdwnlgzfchwexpipynj","glxnzuiferbiayq","twckgyddbpguxnhnyletw","ag","cheisnmjawbxkzcpar","dmxemiheipucszrglqkhxvvgikoi","jpgyxrlxczntwitvismvpwmjmro","h","bgywmppjowqhrcmdqpjdfoqhqrx","jjyuahmrdpafm","dgxklfinhctvyx","pbasiae","jtpkprjhbmadfjptnpoooofkvs","xvphtjuarjrqykeexau","rancckwtjkqer","hlebmkbnbqrlarobzqv","igzlykcm","lmwrnueyigomrwmzhhex","laxokozahmhqatszq","gbhgdpicwbedephl","emhwtsrtmoimgrxzkzfvbhqwtnjh","ddktswernlqporqaknulixfpeopt","uhgmxrepqmtcxsmjyxdtzrrb","sqdg","wrkcbmiqfyddwwfgjvugigfrozj","bkfvgcxzojipymnflfndgzjflwl","nl","rqdyhxybbvirstqcd","fgc","aeelyqjipgylngsbtajpudrvjdzx","qgxvvnkntozdombnqgcf","entzylrctjwvstdqtgomxwaeftgi","npdmfwlrvxqvpwjb","pugtoeegfdzqamcok","btfhq","ctlgwwphbmqbiqzwakrgmqslvqy","iwvudutevttjo","lzr","zpzsgqtbuhogsup","if","ee","oizvtixjxeqhttvxatgehmwhkghoj"},
                words2 = {"twzxcqhcwtbgmmgjas","ygysvpzyjijq","lbz","wvfthvqcswqokfckdzhm","oiheznbhdwxesbvfegcsimtc","fxiaodudpqqmicny","bnlwykbndlkwkl","witgcbqrprjamtnzhfajr","rmylwzjigriackktxryuhdjftpo","xtahwttwpxznuomwpcep","fnbgruribmjrgwkdvxafwynhtb","gq","qhgeyrzunhnihx","wlwzgmmmdhyeurqqitmnbur","loxllnduvm","mtpnqlovsjpoioxgrxilkxggfxtioq","dfzgftinespotqqtefwg","nsdbyzebeiylwynjrnobwhjdnq","pqfzzivkfdwcyxwmrimt","aynthdsrvzxoymwp","llrrliyvodswhdopsaxcgrusuph","kngcjtdjhnnfatzglabhld","wpazipxhqtnqqhxbt","pmtsioabwrp","oxkbrovsd","oyqnbqvfnuuinyoerplnclhk","nkzvrxfjl","l","deueyvttxszlcnqxj","fuhhbhitfhvznsfmjnxnag","egezcwglxbfvnoumyph","qrpvcxxjsigzasn","hwuyurqbnxdahbqmjvluy","upnenvlwwrvyfiknlsuwukjy","rmdfpvrpbvdjcmvvrydyxkbi","nrbpmimbskhlawybnxtemedaue","tw","uyrfywhxwswffyklufilqzwsrw","jys","qpubjbgpumexgg","btkyhmjwcrjmqpdozinfluknu","grjsrmnrqahhst","dujsrtqnwadexekyplxcdoz","vspdbzu","wjj","xnlqrlzlfcni","eajtsjctnrzjuwuoacs","ynxwphscai","udxnzs","frxtmxloazsbunfzhzzg","zeqjzgidbwl","ajmkbprrccgvchwhfea","idpbphdkuaokgyjyn","okfrhjex","zpdjwspdwwqdzffoyqivplabozl","bvjgtppbnnvryaz","mfzdqgiflnzkhnombuhiaemekxhkbv","eekvfcagfpyhjwxe","tycidzcc","yicomonaszlzzpvmrqvfihwix","zaeppooiwhyvsj","watufqzpzexkvyogcgcs","prohoevihzpbmedeo","e","q","lqwdkljzjwxlwnovjxmn","fcmeusim","uydozbgsyrtenyhxesoqm","cheobhjvhsixpstoknrnrsur","qavl","zlokowmfgktrhzftocyaiqxx","ryulernvlcexgwwrlsextoqd","cgdsunqektggvbgjeebyndhsyrrwq","fumbqxoola","fypvfygesbqk","b","glxnzuiferbiayq","twckgyddbpguxnhnyletw","ag","cheisnmjawbxkzcpar","dmxemiheipucszrglqkhxvvgikoi","jpgyxrlxczntwitvismvpwmjmro","iraeefoynsihtyzhwl","yes","jjyuahmrdpafm","gtzaspwfgadalcvyudlodbsgehvosc","pbasiae","btcdqzqztole","xvphtjuarjrqykeexau","rancckwtjkqer","hlebmkbnbqrlarobzqv","yhputqhpnghqsnidfngphcn","lmwrnueyigomrwmzhhex","laxokozahmhqatszq","aviwtuk","emhwtsrtmoimgrxzkzfvbhqwtnjh","ddktswernlqporqaknulixfpeopt","uhgmxrepqmtcxsmjyxdtzrrb","sqdg","wrkcbmiqfyddwwfgjvugigfrozj","bkfvgcxzojipymnflfndgzjflwl","nl","rqdyhxybbvirstqcd","fgc","aeelyqjipgylngsbtajpudrvjdzx","qmndpbkpfpqnvzzsemko","gkbmtslpcgllzcjfwf","npdmfwlrvxqvpwjb","pugtoeegfdzqamcok","wgdjsydiwtuasm","aon","iwvudutevttjo","lzr","wzk","ywtgfcrjlwvifkndsyhqomwtbiu","ee","oizvtixjxeqhttvxatgehmwhkghoj","gn","z","hdevtwdszmhb","pzkxuxckosnpcnqazwjb","tpqpioajoc","mwtemvtvfyejnnbyviptflhro","szmbimrkarleyofzjaoakru","hubkf","afuyijdmdahvqokmg","o","dayohbrvqvvniuhwoljkmwxnrrgxt","kqbipirgczkodws","odwwmctqijnlqsbei","owx","yfnkdhbrxgbqucfeidngxybgwhba","riwgxgpqtcauudxtf","ickffablcmd","yvxxzwlqybbhym","jbjofhf","vtklxlxlqupqduvutwa","wstkcbzfcrewqihkijlqfasl","bmqquxshklehikuq","hzfdyiaoimry","kcmhwioxkidnltajtjjcxvvnb","ehudwrngzmtagjmkurv","qfbaeyhtaofksljlqrlqcvhw","gee","fnlk","iodtgya","lqbyhzgodwoscluie","ptvkazksmjsm","uzhxwvscudulqwobfq","jagdhljkkcfwtgaxrirvjrc","q","qhmdwbtefcussc","cgjfapwkfvxoqxlsmgos","txacbwvphvgfoirgzxkwseqgi","wigegebdqcnmotdblmhbteavzda","pbfipiipetijluppsvllk","xuzpvtvdciyeybdgeedwwzlyymtyx","psyekclfynkwktokuqzwonnngavy","cezccbb","miczcmmkot","rqayvstjsdzfrddacgzgfqutfpzkj","vojpeoqpmtnqulnvombwsbcw","cqqbrdpmdrucenawookboufz","lro","hayhwo","vkydfsjehmmozjmcrsxeceek","olcpnplrvai","ingjshns","itj","obmqirletcexpdesvoadzj","ybbxolsfithaqnc","vxpnbm","bnvvlxg","pvurjbnessbrqafomgaka","yspixhgiyzvdevemychvj","rbmlyytgormnalfjzszy","vhubxhddvdaiky","whpteilzsnw","puupcjmpggaqiosxamos","jzywkjtfchztbanjkpnmmcqeo","m","qjvtmtdhdcjei","wblpbfcrhskjlhdtxhbphuecddbzw","mdnycukkkwqvreepjbm","zvmccjhljuxdxuzwvismrbqjro","hxftztrhcydzipyfdngzfbl","tovfecrduqwruspusqefx","thxhtaavmgkzzydkxayrcmqlz","rdzmqkzapxesgnwkesugx","surwqdhdgsdeorg","dbelraoozfcgmpmujthvss","fupcquuftfkmcghouulmwuibsirdw","zhmjzgrl","sejnndhts","eakhwrpknfv","flvkcvvxjvyeisvfdppobtnemriotl","zcgmwer","gbkhbfoqpdqokhtviffrxtxe","cnqchyqgsdmtuwvnndal","ueczpjxxpoxxbkfe","naqzxljvciaysbhjync","hjnmirvhbiybyutwagi","xosjmequrnjrm","kzlpfftoiyxyqgvzdliccuuxugfjzt","kb","jjjkmcgzshjbhvtmsmi","dgqlwkqomyyxckpbvcylstwsnrwt","po","oeqidqwfbmk","buoiwwtbvlcpkccsvuluwk","smhtdjz","uowlaa","urxjydgw","rh","wgziouxdejxkpasf","q","hdknzpsgazsguiodvieduvul","iiquglphucbpvefzqfaltefocna","qvtcweyjqnjiiendwlyfkwsme","vnenlvwbtsmuqdlpktjheyptvlb","vvnraxyppzbtqrmoegjmlg","rltgviwossxvrzkinsligjd","ndusfhtswvg","iaw","rlb","gcuvqnxgcpptsjtmmbcoxgnnmrlmwz","svhgeh","tcsd","emqtemyh","haqogqcu","rtmsilkvjvydneedtzxzwp","fmdc","oyrdeod","zmxfub","agdylymxbknb","pvbmulpzuxub","yzsoanjcq","rgr","acnhyybfh","bfbpjtdoswxndriyp","kimhxlwuidycoytnm","tcsugyackjfpnleumragmdigsf","qtkgoibopozkm","rhbxdcwiorxagztukjnxdghudibj","qvivzqltn","vfqxfwv","na","vs","vmsbtjudtxosicpoayjoqrkfbk","hzulczvfso","hbekoerifobdwtxturpcrykt","mqhvbkjlaxyiewottbg","ylbcbbaagqkubfd","w","pzeugohdcxtnjibmmxcw","tcavivldioptxysxlimlnudueoczfr","ztrcacrhwyogfzgj","fepbycwyjxvfikgkmuvtbxkjkzdn","ihsdpdsuywozmgyrvhmuwgdcbo","tapib","ehhnqamxrmzywndwfyreyxjbqvink","jrgkfxncfuylzlmvlrh","teysbfkjpxfbcsobvajsovmfhzwin","rqynckrqkpd","kaztrfqlyrqunnsbyuidtl","thjutmjdiadgrqwfsi","kofgmtkhjdtsjcdbigadymsncdykuq","mhvokxsxmd","xtgdfbmtoagsxulgceootvrnxn","j","rpixjymdxrgyhcrej","lcozyctmosnayj","zjszaemenwmhgkuuwxygtvlyhrxpb","lcybowtwiuuvxecopcpna","bqecgjobqbyobljk","nnkbvycd","c","vkjmmecmp","hnemlvdowekiddipjceodgw","fgslyxaanxwnfcpcqxwihcgjzqxejc","ueynaykddhouheqxqxds","thrtz","doprovsenzsdecmqlyafdry","ecjzfbiztpd","qbadmzykbhgprjxefhtcwgr","ttltxifu","hpvnyufvtm","o","bpbu","okiyrbdhnexkiabiddthvirpbuinuj","odelacygngwznscfazeheq","zkrpznzkfjypi","n","xpfgskttgetyvmqyfirot","wmuzp","walvad","rjnhrgtgbqiulcrh","epjrrmegqhzwltbjcvdasbymfzeq","kxstqqghkpyrhkdnfcmkk","bbiewcwdnqyiecjcemgochbkup","x","qvgxhljtlasdjwefvqbhuwi","ed","jodmdtmudqluhouaascgllbfpu","huzyajrbkkkqatsocvgkmm","malqtvepzzbmdkvnsqrc","klogzdavxdwbpighpqhkturaazvd","ztpqxmfzopjryphikvlf","vvpzpgkihigrg","pdekskkpmdchwwlxgzdr","jeejxunimrgwfaokmrgpukklcpuzqk","otdsogwrfqlflugap","wmlrzingmqgmdsiaynhpxmtr","ezvoishn","ntfmpjpnowxbcjdombmju","equbytevxec","egqsyahskcqcottvqdvvezfnhz","sndtldekdnnzwlkpgpni","vnwuigoxpicaotwcyaxoqdlbfapggh","bmlkonnlnzmygj","mjbeujkckpzrys","bahubdgpotzguepkirhni","kxlrfrhsvpoocbyzl","ltaprgnvqlmhcuxadtcanoslbgy","gutwpxukkbcjsgznlqzhtsfyldnzcw","jtdbczcgbuateurgccyrgymdyee","dveqvzumxwscxuhaujfnwtpiezwp","pruojr","nxrcrwnaxtrgzytdk","eml","viewaypxbzdfkpvvbtwynbkmqi","avmiedltnhdpwlfwmd","ksrwrpitvsqe","csheypazgtzjgdx","otljjsovffgoymvav","sm","lgrlgpqyjktequjrdfy","exql","biwtjbshy","ewygeepgsvfldufjgdpwteckfnvoe","pjbrihw","xeanufqgyi","xkmmthmhoneh","mrlhspgijskrcnixlmsxufdqpccigt","vltnjctzselig","hcccvijvf","hhvbuorrtckycm","paomci","eemnllhapvyazxcbewjofkdegknuv","anocyvdpbltcjky","olwsuvdxnyrqjbjevuwqbihgmxprg","vtbj","ohgyvbfftvh","sm","wv","nxtqqzt","esrdosr","wrysfkexqfhwvsmpms","zhayprsxs","tvimkejchbgnihcsfonmoraxxebx","pbuhcntbnof","oemfzkwcjsfgesyjquahxvhs","evbwxvqp","oykeohlymjvbldmbtiigug","zdvtzqomncaxgvtufkefhjtgomnmof","oetoixtliqgorfizihc","b","emau","fusup","dwrigihtig","exyoy","pan","zeftfga","vumrvncvybxwlbafwzrdtos","kiwhatocpfswlahyebywkr","kwbttyjimiqnaihyikoxugaz","lqbpbtebnm","im","qpzodkaovko","gypyeuafjwrzmmfdfbfilldab","ttyfkh","oshalpqjdcemrtbhgmnecoera","stlpmqgjamhrgbgx","gqhmfhrf","lxbvsqmxp","xqaze","wpjesolefiwjlemnd","obrvzyom","cwohpprbgxlwlkzfdjyconovywvrh","ifnmaytvv","zirsbsmcbfwbzgwsegqdr","cpywuznnzqhuelzjmhundeeqolq","ngydlfiyoqhxgteippltizah","mecnrcrerlg","offyuz","anexcbgrvfjagokzygcowoortwtnz","zsvjorabfpgrqalyxnhhoryskqr","gutvjdvqkqczvwjqjm","azhxkjmzfw","dwbwfmstsmrciwmgpr","blbbtcbzbucufgcsqkdwwnv","lhku","rzweasekzkvjplk","evjccbjqmdn","dlazqadtyh","qstqshxnaqfuxl","oegcu","bhualwbqyyjbk","g","jxssuq","enijnybwjjiqovao","iwepsyouprvfknbagadum","plvjhhnrjdmjdbhnsxfvangqmbeszn","nzqszgjxiwepwsaawnswtqi","c","pphiggijjkqglhrqjibihmimniaix","c","vkghlnufxmrcl","jlt","gsrxekxsrzcrgglmlgvylljjzjtuo","pbucjbesduowsyqoulkqeglrv","tosstwfsidzud","yduayxpaxayhkcbv","fjrefhicxjmxxxhzuwxc","jwueuaimrxt","cuwhufbxgvoexjtwoyksmtrjrqzb","ppqrjshfktidiskguystptbfdeuhh","dxbijbtbienfejtmb","iayehtjor","cltyhzzfmgjzgpakmmlhkjyq","kjarkt","kqutq","dlvindiwybedtrsvh","lqosbdvlqhgufnrfdxiul","dbbkcxtlilufclkib","aciueayhxlaizaiks","lmanqgxwhcffibqmdrnflsv","unpdadztygno","ovkeermiwk","krtwz","afqgdpgmvweifzqkcakstceaj","hnh","dzndaoyssthbsvbuwfdsuixamnymyz","wrykjzozagjcnxjehi","umksukytggmppgqgrm","yiktrupqtocxbprfd","ymlenfvipk","jpuauhlasmtgtyyvnoedjjgfzem","yrkonlarq","naegigbbzaataaplxepiaunfd","arxzgknnvb","wdxq","kxivvj","xcdmqhxqhmnzqdbmxirsvhtxit","gzttrsfkb","emkjen","xbtjkltmdmopsqwfnhmgoassot","dxnzjedruslhblusl","nmnghccabjjoynxpomrr","wccnzzgdczyymlsbfcayx","riqbbgpgpgrbwunuxjmvftjmqsaex","ifadepabcpv","joqsspvbrpifvtumagnvixb","ilhiaw","rfislmirwsruonbzqwjhvidtd","cqwznadgfggyqpaagi","azvyqhvtlkudhgwwfgamq","gbclagl","kzwibwwt","nollakqcvygkuygzujybtyvlsxuour","rozedorxzpxabtmowk","eoermfthyldaecodlci","uxbvnmlnx","latkhshjsibbpkai","iokqnaabtrfj","wrgomgbvyhkatbbpt","szzwsglznlgenwzivowgjosghz","adlvyepi","lqx","kumshhpvpbhryen","vlpbqpqzmvkyxspyjsjdzk","wdyno","cvaaenfutspuhfyoacstfxya","f","nupomxnjqroejwgjtpuvzvgm","pqykycfzek","hlpqyklxohcdcotgtneuckmmoel","kglin","ljvtkslrmzlyssthyxwsen","bhozmohzhmumeisk","cpbsglgeygetlw","tsknbqxrh","qiflvjdnoctetnamnfigjpexe","mbikje","bccbbxxfht","p","qpumsodqfayrgpqysfrpou","lbw","xpiqktrwwqzibhkktnpybagi","ammfpegjjpwkip","nuqclrjszutweinqtqmavsstgto","xxsnivukbpuhqpa","lfxktjwpuufbpewnkx","cdpnazmuwnrtzapukzbmycytrgl","wqpvwhtpghqkknxq","knjvzgwnokkcsgbbm","cengttqd","h","kpd","zhvpvkswtfmb","dtaqgzyopgknztmlvnuup","y","jy","zrflmosmgplx","kcydmmurdlztlgszlrgsmrabzkin","yhykzorw","zjhxihpscgxrpdwcvyjhyodjxoeka","ymx","lugqt","utcnos","cbgfzkljgvojksnfhjrhias","nug","ixhjmusa","zvbvmfgij","jfznfmhdkiiw","lietkxhhlyn","ldxlcgwqtqqirxpyxqrjpsyuyypa","yhqgkdiscgeposqdvfyclqcejs","xugjpuafdrtvqfpeqkafkot","tmszzccbi","efko","krkthrzctcupegoi","wxmepxsewvqxlfhhclbashbxg","mgljjephregz","sbpxvblknotnfbknlpuylfmmderl","skkwehsvouggfga","gwwt","pmdzjitmojahqojiljllnyltc","ilutg","pwkvtixyprvencpgbnc","vlbhynnsuneemgi","dzxodsokyxbqonw","plwz","dhr","sosc","tuydonetlxnkhllxpzghsjffpx","ailmeocehgsulezrpexnlc","dktdpe","wacotajmocdhnevwreacqnrurjv","ckzwcuxwxexsdteeahlimuaqwuz","zmvoncuknvyuwzmcyekdjwvsz","ncbtioagfehe","sfnc","frynigluzcrfknyncvol","rwwikrzzuopwtjabgcerclvwoof","iboqhbcpsoherwncphkqysrzd","oszmzkdwcn","buyfmryigdclqwiuexmn","wzwxxuvmbksodqnhy","pbxo","txhgivhuyput","jdoupusqtrndlpweayy","pxsqfdvsgrosz","bodobfylynowgqobetds","odxz","pfbxyf","f","kajvpd","jgbdjwftozdlpdjlnrdlapsfgwxg","cjemkrdfizcwptmbvqjrnh","tbnjyik","kwpmjjyxecjraywi","qcxgmsfenvnswknwkhmupn","wnwcu","lyseiutmujtgvmqkixex","pkfcaoejksimgvoroiogbomvmqkh","buzdkbqcsyqxssvforbak","zdhptzvkyzrtrwfehpmkkjyfhdivd","ugmzejszpkujsy","aelsiwcckwizwlttdsrerd","gsmigdbftzvbcqsguvyxqjus","ewekrlaeknxaeey","mnbmkmlaohibrkrxncag","miqhsv","wtgvrdyzdlcvsppszg","tomurxwlwvcqavwlgyuneuovg","xpkanzqenecuhrkdjn","ejypeywncr","uitveoiypboewfsmuj","sdvhcibafqntfeb","rofzjesaroawlksko","icotnsqbazcrcyp","ctzznxktoa","pynoaovokvhpzxeuksse","ywvbkk","uvxtvtcqfxvcwzq","hmmt","lgdtjbzkgiwtsylnv","psug","kfvlduwvubrettrpvxomt","cwgtflabjpfgnu","tytazrhepg","u","cawmgemxerzkxtdofvphwclznbkg","oyyfajkkfylyphigolzhrscmiiequz","slq","bcpuwdvcpovr","efreftb","fsafwsggphpakdnlcy","rgtxtrljamufxzopajeuj","ejteieoukkugdiyszjhogvb","wdddkbudoskkiesnvudgasuu","mmmjisqsxutjmzqyvjab","uxlbshygkrrjedpj","oxuxycxginbohm","jppvavirjvbsenjzbv","igepagcpoauxrpdfssumxqoprcqxwk","vumjnlnceukvaam","qncrznokdtvinqvcspm","delgkpwhqnroyejcbckm","thkcbudmwdikpnmbgdrh","hi","gashqxdhdbckkxzpdmvrthp","qjoyksgvsgtjmcgxuhutrkmlq","z","zeecfacbvixofekbfkaef","evcvgbgmfkwtmyhzlou","uceujmuoxlgpmmucovvu","gwggtpqprwvoww","cappyympzgfdhekirdmplnaasiaud","runkcwdwmz","czauvzwvbfk","sfanroynlmug","hfxbbtkjczzgljr","uqpxrmklvujgezuzbttzkpwsjyn","jguxurqgrsobsyowfuxkgdfiogpio","yrn","enq","hpsijupw","ddggcrwbwz","mmwoejnulkqrfanifswddvhkylel","ckc","sza","bvcayulzqkzhckmgbuclccejyawe","qk","dpufhtef","wf","hdcuaixcgdqpa","wedjmvq","ccghqu"};
        int count = countWords(words1, words2);
        System.out.println(count);
    }

    public static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        // 遍历第一个字符串数组
        for (String w1 : words1) {
            if (map.containsKey(w1)) {
                map.put(w1, map.get(w1) + 1);
            } else {
                map.put(w1, 1);
            }
        }

        // 遍历第二个字符串数组
        for (String w2 : words2) {
            // 判断word2中的字符串是否在map中,如果存在在判断count是否新增
            if (map.containsKey(w2)) {
                map.put(w2, map.get(w2) + 1);
                // 如果存在并且只出现2次则算一次
                if (map.get(w2) == 2) {
                    list.add(w2);
                } else if (list.contains(w2)) {
                    // 如果list中存在并且w2字符串出现2次以上则删除
                    list.remove(w2);
                }
            }
        }

        return list.size();
    }
}
