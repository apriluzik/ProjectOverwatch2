package com.apriluzikgmail.m.projectoverwatch2;

/**
 * Created by mapri on 2017-06-29.
 */

public class OverWatch {

    final static int genji = 0, mccree = 1;

    String[] names = new String[]
            {"genji", "mccree", "pharah", "reaper", "soldier76", "sombra", "tracer",
                    "bastion", "hanzo", "junkrat", "mei", "torbjorn", "widowmaker",
                    "dva", "orisa", "reinhardt", "roadhog", "winston", "zarya",
                    "ana", "lucio", "mercy", "symmetra", "zenyatta"};

    String name, Korean, type, Difficuty, Introduced,
            Name_ab1, Korean_ab1, Introduced_ab1,
            Name_ab2, Korean_ab2, Introduced_ab2,
            Name_ab3, Korean_ab3, Introduced_ab3,
            Name_ab4, Korean_ab4, Introduced_ab4,
            Name_ab5, Korean_ab5, Introduced_ab5,
            Name_ab6, Korean_ab6, Introduced_ab6,

    RealName, age, Occupation, base, Affiliation, subText, mainText;

    String img;
   String icon_ab1,icon_ab2,icon_ab3,icon_ab4,icon_ab5,icon_ab6;
//String OW_small_logo ="https://overwatch-a.akamaihd.net/img/nav-logo-condensed-hires-da2b2618cf8e6b46ad199e7c4acab89dd54773912b5b46b6130b9cff82e7b0e58f7d2fe898342de2b19da7dd09a70d5a1d4cb52912533f62b94fecf791f43048.png";

    public OverWatch(int index) {

        switch (index) {
            case genji:
                genji();
                break;
            case mccree:
                mccree();
                break;
            case 2:
                pharah();
                break;
            case 3:
                reaper();
                break;
            case 4:
                soldier76();
                break;
            case 5:
                sombra();
                break;
            case 6:
                tracer();
                break;
            case 7:
                bastion();
                break;
            case 8:
                hanzo();
                break;
            case 9:
                junkrat();
                break;
            case 10:
                mei();
                break;
            case 11:
                torbjorn();
                break;
            case 12:
                widowmaker();
                break;
            case 13:
                dva();
                break;
            case 14:
                orisa();
                break;
            case 15:
                reinhardt();
                break;
            case 16:
                roadhog();
                break;
            case 17:
                winston();
                break;
            case 18:
                zarya();
                break;
            case 19:
                ana();
                break;
            case 20:
                lucio();
                break;
            case 21:
                mercy();
                break;
            case 22:
                symmetra();
                break;
            case 23:
                zenyatta();
                break;


        }

    }

    void genji() {

        name = "genji";
        Korean = "겐지";
        type = "공격";
        Difficuty = "3";
        Introduced = "겐지는 강력한 수리검을 정확하게 던질 수 있으며 진보된 기술력으로 만든 일본도로 투사체를 튕겨내거나 질풍참으로 적을 빠르게 베어버릴 수 있습니다.";

        Name_ab1 = "shuriken";
        Korean_ab1 = "수리검";
        Introduced_ab1 = "별 모양의 수리검 3개를 연속으로 던집니다. 수리검 3개를 한꺼번에 부채꼴로 던질 수도 있습니다.";
        Name_ab2 = "deflect";
        Korean_ab2 = "튕겨내기";
        Introduced_ab2 = "번개처럼 빠르게 검을 휘둘러 자신에게 날아오는 투사체를 적에게 튕겨냅니다.";

        Name_ab3 = "swift-strike";
        Korean_ab3 = "질풍참";
        Introduced_ab3 = "바람을 가르며 튀어나가 대상을 베고 지나갑니다. 이 기술로 대상을 처치하면 바로 다시 사용할 수 있습니다.";

        Name_ab4 = "dragonblade";
        Korean_ab4 = "용검";
        Introduced_ab4 = "짧은 시간 동안 검을 뽑습니다. 겐지의 검은 근접한 대상에게 치명적인 피해를 줍니다.";


        RealName = "시마다 겐지";
        age = "35";
        Occupation = "모험가";
        base = "네팔삼발리 수도원";
        Affiliation = "시마다 일족(예전기록), 오버워치(예전기록)";
        subText = "내 한 몸 버릴지언정 내 명예는 버리지 않으리.";
        mainText = "사이보그 시마다 겐지는 한때 거부했던 자신의 로봇 육체를 받아들였으며, 그 과정에서 한 차원 더 높은 인간성을 갖게 되었다.\n" +
                "시마다 닌자 일족 수장의 막내아들인 겐지는 아버지의 특권 속에서 화려한 삶을 살아왔다. 닌자 훈련에서 타고난 재능을 보였고, 또 이를 즐겼던 그였지만 시마다 가문의 불법 사업에 큰 관심이 없던 겐지는 대부분의 시간을 방탕하게 보냈다. 일족의 대다수는 태평한 겐지를 골칫거리로 여겼고, 또 그런 막내아들을 감싸는 수장을 못마땅해 했다. 그러던 어느 날, 수장은 갑작스러운 죽음을 맞이했고, 겐지의 형인 한조는 겐지에게 선친의 제국에서 더 큰 역할을 맡을 것을 요구했다. 겐지는 이를 거절했고, 한조는 분노했다. 결국 두 형제간의 갈등은 격렬한 대결로 귀결되었고, 그 결과 겐지는 거의 죽음 직전에 이르렀다.\n" +
                "한조는 자신이 동생을 죽였다고 믿었으나, 겐지는 오버워치와 앙겔라 치글러 박사에 의해 가까스로 구조되었고, 국제 안보군은 시마다 일족과의 전쟁에서 겐지가 보탬이 될 수 있겠다고 판단했다. 그래서 오버워치는 거의 죽을 뻔한 겐지에게 새로운 육체를 제공하는 조건으로 그의 협력을 구했다. 겐지는 길고 복잡한 과정을 통해 사이보그화되어, 더 민첩해졌고 더 강력한 닌자 기술을 쓸 수 있게 되었다. 살아 있는 무기가 된 겐지는 일족의 범죄 제국을 무너뜨리는 임무에만 매진했다.\n" +
                "하지만 시간이 흐르면 흐를 수록, 겐지는 자신의 모습을 거부하기 시작했다. 몸속의 기계 부품들이 혐오스러웠고, 자신의 새로운 모습을 받아들일 수 없었다. 결국 겐지는 자신의 임무가 끝나자마자 오버워치를 떠났고, 삶의 의미를 찾는 긴 여행을 떠났다. 수년을 방황하던 그는 마침내 옴닉 수도사인 젠야타를 만났다. 겐지는 처음엔 젠야타의 지혜를 거부했으나, 자애로운 옴닉 젠야타는 단념하지 않았다. 시간이 지나 결국 겐지는 젠야타를 스승으로 맞이했고, 그의 지도 아래 겐지는 반은 로봇, 반은 인간인 자신의 정체성을 받아들였다. 자신이 몸은 사이보그지만 온전히 인간의 영혼을 갖고 있음을 깨닫고 새로운 육체를 축복이자 자신만의 능력으로 바라보기 시작한 것이다.\n" +
                "이제, 난생처음으로 겐지는 자유로워졌다. 훗날 자신이 어떤 길을 걷게 될지는 알 수 없었지만.";

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";




    }

    void mccree() {

        name = "mccree";
        Korean = "맥크리";
        type = "공격";
        Difficuty = "2";
        Introduced = "피스키퍼 리볼버로 무장한 맥크리는 황야의 무법자로 적들을 한 방에 처치하거나 독수리처럼 빠르게 굴러 위험에서 벗어날 수 있습니다.";


        Name_ab1 = "peacekeeper";
        Korean_ab1 = "피스키퍼";
        Introduced_ab1 = "맥크리는 피스키퍼라는 6연발 리볼버를 애용합니다. 공이치기를 빠르게 당겨 약실 안의 모든 총알을 순식간에 발사할 수도 있습니다.";

        Name_ab2 = "combat-roll";
        Korean_ab2 = "구르기";
        Introduced_ab2 = "이동하던 방향으로 몸을 던집니다. 구르는 동안 피스키퍼를 재장전합니다.";

        Name_ab3 = "flashbang";
        Korean_ab3 = "섬광탄";
        Introduced_ab3 = "적의 눈을 멀게 하는 섬광탄을 던집니다. 섬광탄은 폭발하며 좁은 반경 안의 적들을 제대로 움직일 수 없게 합니다.";

        Name_ab4 = "deadeye";
        Korean_ab4 = "황야의 무법자";
        Introduced_ab4 = "집중 조준 그리고 발사. 맥크리가 정신을 집중하여 조준한 후 방아쇠를 당겨 시야의 모든 적들에게 총을 발사합니다. 약한 적부터 치명상을 입습니다.";


        RealName = "제시맥크리";
        age = "37";
        Occupation = "현상금 사냥꾼";
        base = "미국;뉴 멕시코;산타 페";
        Affiliation = "오버워치(예전기록)";
        subText = "정의는 저절로 실현되지 않아.";
        mainText = "피스키퍼 리볼버로 무장한 무법자 제시 맥크리는 자신만의 방식으로 정의를 실현한다.\n" +
                "맥크리는 미 남서부 일대에서 불법 무기와 군사 장비 밀거래로 악명 높은 데드락 갱단의 일원으로 이름을 날리다 오버워치의 함정 수사에 걸려 체포됐다. 뛰어난 사격술과 지략을 인정받은 맥크리는 철통 경비 속의 구치소에서 평생을 보내거나 오버워치 내의 비밀 조직, 블랙워치에 합류하라는 제안을 받고, 후자를 택했다.\n" +
                "비록 처음에는 회의적이었지만, 시간이 지남에 따라 맥크리는 세상의 부조리를 바로잡음으로써 과거의 죄를 씻을 수 있다는 믿음을 갖게 되었다. 맥크리는 관료제와 불필요한 형식에 연연하지 않는 비밀 조직 블랙워치의 유연성을 높이 평가했다. 하지만 오버워치의 영향력이 축소되면서, 블랙워치 내의 불만 세력이 조직을 무너뜨리고 자신들만의 목적을 추구하기 시작했다. 내분을 원치 않았던 맥크리는 홀로 조직을 떠나 자취를 감췄다.\n" +
                "수 년 후, 맥크리는 총잡이 용병이 되어 다시 모습을 드러냈다. 크고 작은 조직들이 맥크리의 능력을 탐내지만, 맥크리는 자신이 보기에 합당해야만 싸움에 뛰어든다.";

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";


    }


    void pharah() {


        name = "pharah";
        Korean = "파라";
        type = "공격";
        Difficuty = "1";
        Introduced = "전투 슈트를 입고 하늘로 솟아올라 충격탄과 로켓 런쳐로 폭발성 높은 로켓을 쏟아붓는 파라는 살아 있는 무기 그 자체라 할 수 있습니다.";

        Name_ab1 = "rocket-launcher";
        Korean_ab1 = "로켓런처";
        Introduced_ab1 = "주 무기로 로켓을 발사하여 넓은 폭발 반경 내에 큰 피해를 줍니다.";

        Name_ab2 = "jump-jet";
        Korean_ab2 = "점프추진기";
        Introduced_ab2 = "슈트의 추진기를 이용해 하늘로 솟아오릅니다.";


        Name_ab3 = "concussive-blast";
        Korean_ab3 = "충격탄";
        Introduced_ab3 = "손목에서 로켓을 발사합니다. 로켓에 적중당한 적은 뒤로 밀쳐집니다.";

        Name_ab4 = "barrage";
        Korean_ab4 = "포화";
        Introduced_ab4 = "초소형 로켓을 연속으로 발사하여 적들을 공격합니다.";
        ;


        RealName = "파리하 아마리";
        age = "32";
        Occupation = "보안 책임자";
        base = "이집트 기자";
        Affiliation = "헬릭스 시큐리티 인터내셔널";
        subText = "무고한 이들을 지키겠습니다.";

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="파리하 아마리의 충직성은 핏줄에 흐르고 있다. 그녀는 훈장으로 빛나는 유서 깊은 군인 가문 출신으로, 명예롭게 복무하고자 하는 열망으로 불탄다.\n" +
                "어린 파리하는 어머니의 발자취를 따라 세계 평화 수호 부대, 오버워치에 들어가기를 꿈꿨다. 그녀는 이집트 군에 입대하여 끈질긴 집념과 전술적 기량으로 장교로 진급했다. 그녀는 용감한 지도자로서 부하들의 충성을 한 몸에 받았다. 모범적인 성과를 보인 파리하는 오버워치의 일원이 된다는 이상에 다가서고 있었으나, 미처 기회가 오기 전에 오버워치가 해체되고 말았다.\n" +
                "공로 훈장을 받고 군을 떠난 후, 그녀는 기자 고원 아래의 인공지능 연구 시설 방어를 맡은 민간 기업, 헬릭스 시큐리티 인터내셔널에서 일자리를 제안받았다. 일급 기밀의 이 시설은 이 지역뿐만 아니라 전 세계 각국의 보안에 있어서 핵심적인 시설이었다. 기쁘게 제안을 받아들인 파리하는, 빠른 기동성과 어마어마한 화력에 주안점을 두고 설계된 실험적인 전투 슈트, 랩토라 마크 VI를 착용하고 훈련을 받았다.\n" +
                "그녀는 현재 “파라”라는 호출명 하에 인공지능 시설을 지키는 데 힘쓰고 있다. 그녀는 오버워치의 해체를 안타깝게 여기지만, 아직도 근사한 전투를 치르고 전 세계에 변화를 일으킬 날을 꿈꾸고 있다.";
        //hero

    }

    void reaper() {

        name = "reaper";
        Korean = "리퍼";
        type = "공격";
        Difficuty = "1";
        Introduced = "헬파이어 샷건, 피해를 입지 않는 유령 상태가 되는 능력, 그리고 그림자처럼 사라졌다 나타날 수 있는 리퍼는 단연코 지구 상에서 가장 무시무시한 인물 중 하나입니다.";
        ;


        Name_ab1 = "hellfire-shotguns";
        Korean_ab1 = "헬파이어 샷건";
        Introduced_ab1 = "샷건 두 정을 발사해 적을 갈가리 찢어버립니다.";
        ;

        Name_ab2 = "wraith-form";
        Korean_ab2 = "망령화";
        Introduced_ab2 = "짧은 시간 동안 그림자가 됩니다. 망령화 상태에서는 피해를 받지 않으며 적을 통과해 지나갈 수 있지만 무기를 발사하거나 다른 능력을 사용할 수 없습니다.";
        ;

        Name_ab3 = "shadow-step";
        Korean_ab3 = "그림자 밟기";
        Introduced_ab3 = "목표 지점을 설정한 후 사라졌다가 해당 지점에서 다시 나타납니다.";
        ;

        Name_ab4 = "death-blossom";
        Korean_ab4 = "죽음의 꽃";
        Introduced_ab4 = "양손에 든 헬파이어 샷건을 눈에 보이지도 않을 엄청난 속도로 난사해 주위 모든 적에게 막대한 피해를 줍니다.";
        ;


        RealName = "알 수 없음";
        age = "알 수 없음";
        Occupation = "용병";
        base = "알 수 없음";
        Affiliation = "알 수 없음";
        subText = "죽음이 너희 곁을 걷는다.";

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="\"리퍼\"라고만 알려진 검은 로브의 테러리스트에 대해 이야기하는 사람들이 있다. 그의 정체와 목적은 베일에 싸여 있다. 알려진 것은 그가 나타나는 곳에 죽음이 따른다는 사실뿐이다.\n" +
                "리퍼는 극도로 위험한 용병이자 잔혹하고 무자비한 암살자로서, 세계 곳곳에서 테러를 자행했다. 그는 어떤 대의나 조직에도 충성심을 보이지 않으며, 지난 수십 년간 수없이 많은 무력 분쟁에 참여했다.\n" +
                "가장 끔찍한 전쟁터를 털끝 하나 다치지 않고 유령처럼 누비는 검은 그림자, 생존자들은 리퍼를 그렇게 묘사한다. 그의 손에 죽고 다른 이들에 의해 회수된 몇 구 안 되는 시체들은 하나같이 창백하고, 생기가 모두 빠져나간 빈 껍질이다. 세포에는 극심한 부패의 흔적이 엿보인다. 어쩌면 리퍼는 실패한 유전자 개조 실험의 부산물로서, 그의 세포는 초자연적인 속도로 썩고 또한 재생되고 있을지도 모른다.\n" +
                "리퍼의 행보를 추적하던 사람들은 패턴을 하나 발견했다. 그들은 리퍼가 예전 오버워치 요원들을 노리고 체계적으로 제거하는 중이라고 믿는다.";
    }

    void soldier76() {
        name = "soldier-76";
        Korean = "솔저76";
        type = "공격";
        Difficuty = "1";
        Introduced = "강력한 나선 로켓을 발사할 수 있는 실험용 펄스 소총 최첨단 무기로 무장한 솔저= 76는 높은 기동력과 훈련으로 숙달된 병사의 전투 대처 능력을 모두 갖추고 있습니다.";
        ;


        RealName = "알 수 없음";
        age = "알 수 없음";
        Occupation = "무법자";
        base = "알 수 없음";
        Affiliation = "오버워치(예전기록)";
        subText = "이 시간부로 우린 모두 군인이다.";


        Name_ab1 = "heavy-pulse-rifle";
        Korean_ab1 = "펄스 소총";
        Introduced_ab1 = "난사 시에도 탁월한 안정성을 유지하는 전자동 소총입니다.";
        Name_ab2 = "helix-rockets";
        Korean_ab2 = "나선 로켓";
        Introduced_ab2 = "펄스 소총으로 나선을 그리며 날아가는 작은 로켓들을 한번에 발사합니다. 로켓이 폭발하면 좁은 범위 안의 적들에게 피해를 줍니다.";
        ;


        Name_ab3 = "sprint";
        Korean_ab3 = "질주";
        Introduced_ab3 = "솔저= 76는 교전에서 벗어날 때든 다시 합류할 때든 필요할 때마다 폭발적인 속도로 뛸 수 있습니다. 질주 중 다른 행동을 취하면 질주를 멈춥니다.";
        ;
        Name_ab4 = "biotic-field";
        Korean_ab4 = "생체장";
        Introduced_ab4 = "생체장 방출기를 바닥에 놓습니다. 이때 방출되는 에너지 장은 효과 범위 안에 있는 솔저= 76와 모든 팀원의 생명력을 회복시킵니다.";
        ;


        Name_ab5 = "tactical-visor";
        Korean_ab5 = "전술 조준경";
        Introduced_ab5 = "초정밀 표적 조준경이 조준선과 가장 가까운 적을 자동으로 포착합니다. 만약 적이 시야에서 벗어나면 빠르게 다음 적을 대상으로 설정합니다.";

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";
        icon_ab5="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab5+"/icon-ability.png";

        mainText="전 세계의 수배를 받고 있는 무법자, 일명 “솔저: 76”는 오버워치 몰락의 배후에 숨겨진 진실을 밝혀내기 위해 혼자만의 전쟁을 선포했다.\n" +
                "솔저: 76는 다수의 불법 기업, 금융 기관, 오버워치 보안 시설에 가한 연쇄 습격 사건으로 전 세계를 뒤흔들며 처음 그 모습을 드러냈다. 비록 표면적인 동기는 알 수 없지만, 어떤 이들은 솔저: 76가 전직 오버워치 요원이며, 조직을 무너뜨린 음모를 파헤치는 데 몰두하고 있다고 주장한다.\n" +
                "정체가 베일에 싸여 있는 가운데, 그는 미국의 \"군인 강화 프로그램\" 훈련을 받은 인물로 보인다. 월등한 신체 능력은 물론 다방면에서 일반 군인을 초월하는 능력을 지닌 솔저: 76는 그야말로 최강의 군인이라 할만하다. 게다가 그는 오버워치 시설에서 강탈한 최첨단 무기들을 다룬다.\n" +
                "오버워치를 몰락시킨 자들을 심판하는 그 날까지, 솔저: 76의 전쟁은 결코 끝나지 않을 것이다.";

    }

    void sombra() {
        name = "sombra";
        Korean = "솜브라";
        type = "공격";
        Difficuty = "3";
        Introduced = "은신과 무력화 공격을 펼치는 솜브라는 침투에 강한 영웅입니다. 해킹으로 적을 교란하여 처치하기 쉽게 만들며 EMP로는 다수의 적과 교전할 때 우위를 점하게 해 줍니다. 위치변환 능력과 위장술 덕분에 쉽게 처치하기 어려운 영웅입니다.";
        ;

        RealName = "??????";
        age = "30";
        Occupation = "해커";
        base = "멕시코 도라도";
        Affiliation = "탈론 로스 무에르토스(예전기록)";
        subText = "무엇이든... 누구든 해킹할 수 있어.";


        Name_ab1 = "machine-pistol";
        Korean_ab1 = "기관권총";
        Introduced_ab1 = "전자동 기관권총으로 근거리에 총알을 발사합니다.";
        ;
        Name_ab2 = "hack";
        Korean_ab2 = "해킹";
        Introduced_ab2 = "적을 해킹하여 일시적으로 기술 사용을 차단하거나 생명력 팩을 해킹하여 적에게 쓸모없게 만듭니다.";
        ;

        Name_ab3 = "thermoptic-camo";
        Korean_ab3 = "은신";
        Introduced_ab3 = "잠시 투명 상태가 되고 이동 속도가 크게 증가합니다. 공격하거나 공격 기술을 사용하거나 피해를 받으면 위장이 풀립니다.";
        ;

        Name_ab4 = "translocator";
        Korean_ab4 = "위치변환기";
        Introduced_ab4 = "위치변환기를 던집니다. 위치변환기가 작동하는 동안(날아가는 도중 포함) 위치변환기의 위치로 즉시 돌아갈 수 있습니다.";
        ;
        Name_ab5 = "emp";
        Korean_ab5 = "EMP";
        Introduced_ab5 = "솜브라가 넓은 반경에 전자기 에너지를 방출하여 반경 내 적의 방벽과 보호막을 파괴하고 모든 적을 해킹합니다.";

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";
        icon_ab5="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab5+"/icon-ability.png";
        mainText="세계에서 가장 악명 높은 해커로 손꼽히는 솜브라는 정보를 이용해 권력자들을 조종한다.\n" +
                "솜브라라는 별명을 쓰기 오래 전, ░░░░░░는 옴닉 사태의 여파로 고아가 된 수천 명의 아이들 중 하나였다. 모국의 기반 시설이 대부분 파괴된 상황에서, 그녀는 해킹과 컴퓨터에 대한 타고난 재능을 활용해 살아남았다.\n" +
                "░░░░░░는 멕시코의 로스 무에르토스 폭력단에 영입된 후로, 이 조직의 자칭 ‘반정부 혁명’을 지원했다. 로스 무에르토스는 멕시코의 재건이 돈과 힘을 가진 자들에게만 이익을 주고, 도움이 정말 필요한 사람들은 외면했다고 주장했다.\n" +
                "수많은 업적을 이룬 ░░░░░░는 자기 실력에 엄청난 자신이 있었다. 하지만 전 세계적인 음모에 대한 정보망을 우연히 발견했을 때, 그만 허를 찔려 정보망에 자신의 존재를 들키고 말았다. 보안에 위협을 느낀 ░░░░░░는 자신의 신원을 드러내는 흔적을 깡그리 삭제하고 몸을 숨길 수밖에 없었다.\n" +
                "그녀는 나중에 솜브라로 다시 나타났다. 한층 업그레이드되고, 자신이 발견한 음모 배후의 진실을 밝히겠노라 단단히 마음을 먹은 채였다. 솜브라는 더욱 대담하게 해킹을 계속했다. 그런 솜브라를 주시하던 세력 중에 다름 아닌 탈론이 있었다. 솜브라는 탈론에 합류하여, 정부와 유착 관계에 있는 여러 기업에 대해 탈론이 벌이고 있는 대대적인 사이버 공격에 참여하고 있는 것으로 판단된다. 그녀는 이런 활동을 통해 멕시코에서 루메리코에 대한 민중 혁명을 책동하기도 했고, 러시아의 옴닉 방어 전선에서 생산 분야를 담당하고 있는 볼스카야 인더스트리의 보안 체계를 뚫기도 했다.\n" +
                "탈론의 풍부한 자원을 활용할 수 있게 된 솜브라는 이제 자신의 진짜 목표, 즉 그 음모의 수수께끼를 풀고 그 이면의 권력을 마음대로 이용한다는 목표에 집중할 수 있게 되었다.";
    }

    void tracer() {
        name = "tracer";
        Korean = "트레이서";
        type = "공격";
        Difficuty = "2";
        Introduced = "펄스 쌍권총으로 무장하고 펄스 폭탄과 귀여운 농담을 속사포로 던지는 트레이서는 점멸로 짧은 거리를 순간이동하거나 전투 중 자신의 시간을 되감아 위험에서 벗어날 수 있습니다.";
        ;

        RealName = "레나 옥스턴";
        age = "26";
        Occupation = "모험가";
        base = "영국 런던";
        Affiliation = "오버워치(예전기록)";
        subText = "안녕 친구들! 해결사가 왔어!";

        Name_ab1 = "pulse-pistols";
        Korean_ab1 = "펄스 쌍권총";
        Introduced_ab1 = "권총 두 정을 빠르게 발사합니다.";
        ;
        Name_ab2 = "blink";
        Korean_ab2 = "점멸";
        Introduced_ab2 = "트레이서가 자신이 이동하는 방향으로 빠르게 수평 이동해 몇 미터 전방에 모습을 드러냅니다. 점멸 능력은 최대 3회까지 충전되며 몇 초마다 1회씩 재충전됩니다.";
        ;

        Name_ab3 = "recall";
        Korean_ab3 = "시간 역행";
        Introduced_ab3 = "시간을 되돌려 몇 초 전의 생명력 탄약 상태 및 지도 상의 위치로 되돌아갑니다.";
        ;
        Name_ab4 = "pulse-bomb";
        Korean_ab4 = "펄스폭탄";
        Introduced_ab4 = "트레이서가 사물의 표면이나 상대편에게 부착되는 거대한 폭탄을 던집니다. 잠시 후에 폭탄은 폭발하고 폭발 범위 안에 있는 모든 적들에게 큰 피해를 줍니다.";

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="전직 오버워치 요원인 트레이서는 시간을 넘나드는 활기찬 모험가이다.\n" +
                "레나 옥스턴(호출명: \"트레이서\")은 오버워치의 실험 비행 프로그램에 투입된 최연소 참가자였다. 과감한 비행 기술로 명성을 떨친 그녀는 순간이동 전투기의 프로토타입, '슬립스트림'의 실험 대상으로 선발되었다. 하지만 처녀 비행에서 전투기는 순간이동 매트릭스의 오작동에 의해 사라져 버렸고, 레나는 사망한 것으로 여겨졌다.\n" +
                "레나는 수개월 후 다시 나타났으나, 이 비극은 그녀를 송두리째 바꿔버렸다. 레나의 분자 구조는 시간의 흐름을 따라가지 못하게 되었다. 그녀는 살아 있는 유령이 되어, \"시간과 분리된 상태\"에서 몇 시간, 또는 며칠간 사라지며 고통 받았다. 심지어 잠깐 현재에 있을 때에도 물리적인 형태를 유지할 수 없었다.\n" +
                "오버워치의 의료진과 과학자들은 속수무책이었다. 트레이서의 상황은 절망적이었다. 그러다 상황은 반전을 맞았다. 윈스턴이라는 과학자가 트레이서를 현재에 묶을 수 있는 시간 가속기를 개발한 것이다. 시간 가속기 덕분에 트레이서는 자신의 시간을 조종해 마음대로 속도를 높이거나 줄일 수도 있게 되었다. 새로 얻은 이 능력과 함께, 트레이서는 오버워치의 핵심 요원 중 하나로 거듭났다.\n" +
                "오버워치가 해체된 뒤, 트레이서는 기회가 있을 때마다 정의의 편에 서서 잘못된 것을 바로잡기 위해 싸우고 있다.";
        //hero
    }

    void bastion() {

        name = "bastion";
        Korean = "바스티온";
        type = "수비";
        Difficuty = "1";
        Introduced = "바스티온은 자신을 수리할 수 있고 고정된 경계 모드와 이동이 가능한 수색 모드 사이를 전환할 수 있으며 무시무시한 전차 모드로 변신하여 아군을 승리로 이끌 수 있습니다.";
        ;

        RealName = "SST 연구소 공성 자동화 로봇 E54";
        age = "30";
        Occupation = "전투 자동화 로봇";
        base = "알 수 없음";
        Affiliation = "없음";
        subText = "";

        Name_ab1 = "config-recon";
        Korean_ab1 = "수색";
        Introduced_ab1 = "수색 모드에서는 아무 제한 없이 움직일 수 있으며 기관단총으로 무장하고 중거리에 총알을 퍼붓습니다.";
        ;
        Name_ab2 = "config-sentry";
        Korean_ab2 = "경계";
        Introduced_ab2 = "경계 모드에서는 제자리에 고정된 상태에서 개틀링 기관총으로 어마어마한 수의 총알을 퍼부어 근거리에서 중거리까지 엄청난 피해를 줍니다. 기관총의 조준점은 움직일 수 있습니다.";
        ;
        Name_ab3 = "reconfigure";
        Korean_ab3 = "재설정";
        Introduced_ab3 = "전장 상황에 따라 두 전투 모드를 자유롭게 전환할 수 있습니다.";
        ;
        Name_ab4 = "self-repair";
        Korean_ab4 = "자가 수리";
        Introduced_ab4 = "생명력을 회복합니다. 수리 중에는 발포할 수 없습니다.";
        ;
        Name_ab5 = "config-tank";
        Korean_ab5 = "전차";
        Introduced_ab5 = "전차 모드에서는 무한궤도와 원거리 포를 탑재합니다. 포탄으로 넓은 범위 안의 적들을 섬멸할 수 있지만 제한된 시간 동안만 이 모드를 유지할 수 있습니다.";

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";
        icon_ab5="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab5+"/icon-ability.png";

        mainText="끔찍했던 옴닉 사태의 최전선에 있던 이 호기심 많은 바스티온은 아름다운 자연에 매료되어 전 세계를 탐험하고 있지만, 냉엄한 인류를 두려워하게 되었다.\n" +
                "빠르게 돌격 모드에서 포격 모드로 설정을 전환하는 특유의 능력을 지닌 바스티온 기종은 본래 인류 평화를 수호하기 위해 만들어졌다. 하지만 옴닉 사태 중에 이들은 자신의 창조자인 인간에게 등을 돌리고 옴닉 반란군에 편입됐으며, 사태가 종결된 후 대다수는 파괴되거나 분해되었다. 오늘날까지 바스티온 로봇들은 분쟁의 공포를 상징한다.\n" +
                "한 바스티온 로봇이 있었다. 최후의 전투에서 크게 손상된 이 로봇은 10년 넘게 잊힌 채 버려져 있었다. 그는 미동도 없이 비바람에 노출되어 녹슨 채, 서서히 자연의 품으로 돌아가고 있었다. 덩굴과 뿌리로 무성하게 뒤덮인 로봇 위에 작은 동물들이 둥지를 틀었고, 로봇은 시간의 흐름조차 인지하지 못하는 듯 그대로 앉아 있었다. 하지만 어느 운명의 날, 바스티온은 갑작스레 재가동되었다. 그리고 다시 깨어난 그는 전투 프로그램 대신, 자연과 동물에 대한 깊은 호기심만을 품고 있었다. 이 호기심 많은 바스티온 로봇은 전쟁으로 훼손된 이 행성에서 자연을 탐험하며 자신의 존재 이유를 찾기 위해 떠났다.\n" +
                "\"바스티온\"은 순하다고 해도 될 만큼 온화하나, 위험을 감지하면 핵심 전투 프로그램이 실행되고, 탑재된 모든 무기를 가동하여 위협으로 인지되는 개체는 무엇이든 제거한다. 이런 연유로 바스티온은 지금껏 마주친 몇 안 되는 인간들과 충돌을 일으켰고, 그 때문에 그는 인구가 집중된 지역보다 황야나 세계의 오지를 선호하게 되었다.";
    }

    void hanzo() {
        name = "hanzo";
        Korean = "한조";
        type = "수비";
        Difficuty = "3";
        Introduced = "한조의 활은 적의 위치를 드러내거나 여러 다발로 쪼개져 여러 대상을 공격할 수 있습니다. 또한 한조는 벽을 타고 올라 높은 곳에서 활을 쏘거나 거대한 용의 영혼을 발사할 수 있습니다.";
        ;

        RealName = "시마다 한조";
        age = "38";
        Occupation = "용병 암살자";
        base = "일본;하나무라(예전기록)";
        Affiliation = "시마다 일족";
        subText = "죽음에는 명예가 따르고 명예에는 구원이 따른다.";

        Name_ab1 = "storm-bow";
        Korean_ab1 = "폭풍활";
        Introduced_ab1 = "화살을 시위에 걸고 대상에게 발사합니다.";
        ;
        Name_ab2 = "sonic-arrow";
        Korean_ab2 = "음파 화살";
        Introduced_ab2 = "음파 추적 장치가 달린 화살을 쏩니다. 감지 반경 내에 있는 적을 시각적으로 표시하여 한조와 아군이 쉽게 추적할 수 있습니다.";
        ;
        Name_ab3 = "scatter-arrow";
        Korean_ab3 = "갈래 화살";
        Introduced_ab3 = "여러 조각으로 나뉘는 화살을 쏩니다. 각 조각은 벽이나 장애물에 튀어 사방으로 퍼지며 다수의 대상을 한 번에 공격합니다.";
        ;
        Name_ab4 = "dragon-strike";
        Korean_ab4 = "용의 일격";
        Introduced_ab4 = "용의 영혼을 일직선으로 내보내 마주치는 적을 모두 삼키게 합니다. 영혼은 벽을 통과할 수 있습니다.";

        //hero

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="궁수와 암살자로서의 기술을 완벽하게 연마한 시마다 한조는 자신이 그 누구에게도 비할 수 없는 전사임을 증명하려고 애쓴다.\n" +
                "수백 년 동안 이어져 온 암살자 가문 시마다 일족은, 긴 세월 동안 힘을 키우며 무기와 불법 약물을 거래하며 막대한 수익을 올리고 거대한 범죄의 제국을 건설했다. 가문 수장의 큰아들인 한조는 의무적으로 아버지의 뒤를 이어 시마다 제국을 지휘해야 했기에, 어린 시절부터 훈련을 받았고, 그 과정에서 타고난 지도자로서의 자질과 전술과 전략을 이해하는 지혜가 돋보였다. 물론 이보다 더 실용적인 분야, 즉 무술과 검술, 궁술에서도 빼어난 솜씨를 보였다.\n" +
                "아버지가 세상을 떠난 후, 일족의 장로들은 한조에게 사고뭉치 동생을 바로잡아 함께 시마다 제국을 다스리라고 했다. 하지만 동생이 이를 거절하고 말았다. 한조는 어쩔 수 없이 직접 피붙이를 제거해야 했다. 이는 한조의 마음에 지울 수 없는 상처를 남겼고, 결국 그는 아버지의 유산을 거부한 채 자신의 일족과 그간 쌓아온 모든 것을 저버리고 말았다.\n" +
                "이제 한조는 전 세계를 돌아다니며 전사로서의 실력을 연마하고, 실추된 명예를 회복하는 동시에 과거의 유령을 잠재우려 한다.";

    }

    void junkrat() {

        name = "junkrat";
        Korean = "정크랫";
        type = "수비";
        Difficuty = "2";
        Introduced = "특정 지역을 제압할 수 있는 무기를 다수 보유한 정크랫은 통통 튕기는 폭탄 발사기와 적을 날려버리는 충격 지뢰 지나가다 걸린 적을 꼼짝 못 하게 하는 강철 덫을 설치합니다.";
        ;

        RealName = "재미슨 포크스";
        age = "25";
        Occupation = "무정부주의자 도둑 폭파 전문가 용병 고철 수집가";
        base = "호주 쓰레기촌 (예전기록)";
        Affiliation = "쓰레기들 (예전기록)";
        subText = "깽판 치기 딱 좋은 날씨네!";


        Name_ab1 = "frag-launcher";
        Korean_ab1 = "폭탄 발사기";
        Introduced_ab1 = "원거리에 폭탄을 발사합니다. 폭탄은 통통 튕기며 움직이고 적에게 닿으면 폭발합니다.";
        ;

        Name_ab2 = "concussion-mine";
        Korean_ab2 = "충격 지뢰";
        Introduced_ab2 = "직접 만든 지뢰를 설치합니다. 지뢰를 격발시켜 적에게 피해를 주고 날려버리거나 직접 공중으로 날아오를 수 있습니다.";
        ;

        Name_ab3 = "steel-trap";
        Korean_ab3 = "강철 덫";
        Introduced_ab3 = "거대한 강철 덫을 놓습니다. 덫은 가까이 접근한 적에게 피해를 주고 이동하지 못하게 합니다.";
        ;

        Name_ab4 = "total-mayhem";
        Korean_ab4 = "완전 난장판";
        Introduced_ab4 = "정크랫은 죽을 때도 자신 주위에 폭탄 여러 개를 떨어뜨리며 자신의 광기 어린 유머 감각을 뽐냅니다.";
        ;

        Name_ab5 = "rip-tire";
        Korean_ab5 = "죽이는 타이어";
        Introduced_ab5 = "동력을 갖춘 타이어 폭탄을 가동시키고 전장을 향해 굴립니다. 이 타이어 폭탄은 벽이나 장애물을 타고 오를 수 있습니다. 죽이는 타이어는 직접 격발시키거나 일정 시간이 지나면 폭발하고 폭발에 휘말린 적들에게 엄청난 피해를 줍니다.";
        //hero


        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";
        icon_ab5="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab5+"/icon-ability.png";


        mainText="폭발물에 광적으로 집착하는 정크랫은 세상에 혼돈과 파괴를 불러오기 위해 살아가는 미치광이다.\n" +
                "호주 옴니움의 핵융합로 습격 사건 이후, 호주 내륙 지역에서 예전의 풍경은 영영 찾아볼 수 없었다. 폭발 후 그 지역은 방사능에 오염되었고, 파괴된 옴니움의 뒤틀린 파편과 잔해로 어질러져 그 무엇도 살 수 없는 황량한 황무지로 변해버렸다.\n" +
                "하지만 이곳에도 생존자는 있었다. 자신을 쓰레기들이라고 부르는 이들은 옴니움에서 나온 쓰레기를 수집하며 어둠 속에서 극악무도한 무법 사회를 형성했다. 그중에는 정크랫도 있었다. 폐허 속에 굴러다니는 부품과 고철을 수집하며 하루하루를 근근이 살아가던 그에게도 다른 이들처럼 시나브로 방사능이 스며들었다. 결국 방사능으로 미쳐 버린 그는 위험한 폭발물을 겁없이 다루게 되었고, 그 애착은 집착으로 이어졌다.\n" +
                "정크랫은 옴니움의 폐허에서 매우 값진 비밀을 알아내며 악명을 떨치기 시작했다. 그가 발견한 게 무엇인지 제대로 아는 자는 소수였으나, 정크랫은 어디를 가든 현상금 사냥꾼, 범죄 조직, 기회주의자들에게 쫓기는 신세가 되었다. 결국, 정크랫은 쓰레기 집단의 집행자였던 로드호그를 개인 경호원으로 고용했다. 로드호그는 탐탁치 않았으나, 약탈한 것을 50대 50으로 나누는 조건으로 그 제안을 수락했다.\n" +
                "이제 정크랫은 로드호그와 함께 전 세계를 무대로 한탕 벌일 생각으로 호주를 떠났다. 발이 닿는 곳마다 대혼란을 일으키고 아수라장으로 만들기 위해.";
    }

    void mei() {
        name = "mei";
        Korean = "메이";
        type = "수비";
        Difficuty = "3";
        Introduced = "메이의 날씨 전환 장치는 적을 느리게 하고 특정 지역을 보호합니다. 냉각총은 고드름과 냉기를 발산하고 급속 냉각은 적의 반격에서 메이 자신을 보호하며 빙벽은 상대 팀의 이동 경로를 막아버릴 수 있습니다.";
        ;

        RealName = "저우메이링";
        age = "31";
        Occupation = "기후학자 모험가";
        base = "중국 시안(예전기록)";
        Affiliation = "오버워치 (예전기록)";
        subText = "우리 세계는 지킬 가치가 있어요!";

        Name_ab1 = "endothermic-blaster";
        Korean_ab1 = "냉각총";
        Introduced_ab1 = "근거리에 차가운 공기를 응축해 물줄기처럼 발사하여 적에게 피해를 주고 이동 속도를 감소시키며 궁극적으로 대상을 그 자리에 얼어붙게 합니다. 또한 중거리에 있는 적에게는 고드름과 같은 투사체를 발사하여 공격할 수 있습니다.";
        ;
        Name_ab2 = "cryo-freeze";
        Korean_ab2 = "급속 빙결";
        Introduced_ab2 = "메이가 즉시 두꺼운 얼음 덩어리로 자신의 몸을 감쌉니다. 얼음에 감싸여 있는 동안에는 생명력을 회복하고 모든 피해에 면역이 되지만 움직이거나 능력을 사용할 수 없습니다.";
        ;
        Name_ab3 = "ice-wall";
        Korean_ab3 = "빙벽";
        Introduced_ab3 = "거대한 얼음 벽을 생성하여 적의 시야와 움직임을 차단하고 공격을 막습니다.";
        ;
        Name_ab4 = "blizzard";
        Korean_ab4 = "눈보라";
        Introduced_ab4 = "기후 조절 드론을 출동시켜 넓은 범위에 돌풍과 눈보라를 내뿜게 합니다. 눈보라의 범위 안에 들어온 적은 이동 속도가 감소하고 피해를 받으며 눈보라 속에 너무 오래 머물면 꽁꽁 얼어붙습니다.";
        //hero


        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";


        mainText="메이는 지구 환경을 보전하려는 힘겨운 전투의 첨병에 선 과학자이다.\n" +
                "이 지구에 과학적으로 설명할 수 없는 기상 이상 현상이 점점 더 증가하고 있는 이유로 새로운 기술의 출현이나 빠르게 증가하는 옴닉 개체 수, 극적으로 증가한 자원 소모량 등을 지목하는 사람들이 많지만, 모든 현상의 진짜 이유는 아직까지 밝혀지지 않았다. 이에 대한 근본적인 해결책을 찾아내기 위해, 오버워치에서는 전 세계의 핵심 지역에 원격 생태 탐사 기지를 여럿 구축했다.\n" +
                "저우메이링은 이 계획에 다년간 참여했던 저명한 기후학자로, 혁신적인 최첨단 기후 조절 장치를 도입하여 아시아 등지의 위험 지역을 보호하는 데 핵심 역할을 수행했다. 메이가 탐사 기지: 남극에서 이 프로그램의 감시소에 배치되어 있던 중, 갑작스럽게 재앙이 닥쳤다. 어마어마한 극지 폭풍이 갑자기 발생하여 감시소를 파괴했고, 손상된 시설 속에 있던 과학자들은 외부 세계로부터 완전히 고립되었다. 보급품까지 떨어지자, 이들은 구조대가 나타날 때까지 살아남기 위한 최후의 수단으로 모두 동면 상태에 들어갔다.\n" +
                "하지만 구조대는 나타나지 않았다. 몇 해가 지난 후에야 이 팀의 동면실이 발견되었고, 그때까지 동면 상태가 유지되고 있던 메이가 유일한 생존자였다. 메이가 깨어난 세상은 매우 큰 변화를 거친 후였다. 오버워치는 존재하지 않았고, 심각했던 기후 문제는 더욱 악화되었으며, 원격 생태 탐사 기지들은 모두 운영을 중단한 상태였다. 그때까지 그들이 밝혀냈던 단서들도 모두 사라져 있었다.\n" +
                "메이는 자신만의 연구를 계속하기로 했다. 직접 개발했던 기후 조절 장치를 휴대용 기기로 개조한 그녀는 직접 기존의 생태 연구 네트워크를 다시 가동시키기 위해 전 세계를 누비며 지구의 생태계를 위협하는 본질적인 원인을 추적하기 시작했다.";


    }

    void torbjorn() {
        name = "torbjorn";
        Korean = "토르비욘";
        type = "수비";
        Difficuty = "2";
        Introduced = "토르비욘은 무기로 대못 발사기와 망치를 쓸 수 있을 뿐만 아니라 휴대용 제련 기기를 이용해 업그레이드 가능한 포탑과 자신과 아군을 보호하는 방어구 팩을 만들 수 있습니다.";
        ;

        RealName = "토르비욘 린드홀름";
        age = "57";
        Occupation = "무기 제작자";
        base = "스웨덴 예테보리";
        Affiliation = "오버워치(예전기록)";
        subText = "일단 만들어. 그리고 부숴.";

        Name_ab1 = "rivet-gun";
        Korean_ab1 = "대못 발사기";
        Introduced_ab1 = "대못을 원거리에 발사하거나 뜨겁게 달군 쇠붙이를 근거리에 발사합니다.";
        ;

        Name_ab2 = "forge-hammer";
        Korean_ab2 = "대장간 망치";
        Introduced_ab2 = "다용도 망치로 포탑을 조립 수리 또는 업그레이드합니다. 망치를 근거리 무기로도 쓸 수 있습니다.";
        ;

        Name_ab3 = "build-turret";
        Korean_ab3 = "포탄 조립";
        Introduced_ab3 = "적을 자동으로 조준하는 포탑을 만듭니다. 죽은 적과 아군에게서 수집한 고철로 포탑을 수리하거나 업그레이드하여 생명력을 증가시키거나 포와 로켓 런처를 추가로 탑재할 수 있습니다.";
        ;

        Name_ab4 = "armor-pack";
        Korean_ab4 = "방어구 팩";
        Introduced_ab4 = "추가 방어력을 부여하는 팩을 바닥에 놓습니다. 자신 또는 아군이 획득하면 일부 피해를 흡수할 수 있습니다.";
        ;

        Name_ab5 = "molten-core";
        Korean_ab5 = "초고열 용광로";
        Introduced_ab5 = "토르비욘이 휴대용 용광로를 과부화시켜 엄청난 양의 방어력과 고철을 얻습니다. 또한 공격 속도 포탑 건설 및 수리 속도가 평소보다 월등하게 빨라집니다.";


        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";
        icon_ab5="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab5+"/icon-ability.png";


        mainText="전성기 시절의 오버워치는 지구 상에서 가장 진보된 최첨단 무기를 보유했으며, 그 무기의 출처는 바로 토르비욘 린드홀름이라는 전무후무한 기술자의 작업장이었다.\n" +
                "옴닉 사태 이전, 토르비욘은 전 세계에서 사용되는 무기 시스템을 직접 설계하여 악명을 떨쳤다. 그러나 기술이 인류에게 더 나은 비전을 제시하는 데 쓰여야 한다고 믿었던 토르비욘은, 네트워크로 연결된 인공지능 컴퓨터로 무기를 제어하고자 했던 고용주들과 갈등을 겪게 되었다.\n" +
                "토르비욘은 로봇의 인공지능에 깊은 불신을 품고 있었다. 동료들은 대개 이를 피해망상으로 치부했다. 하지만 토르비욘의 우려는, 전 세계의 로봇이 창조주인 인간에게 반기를 든 옴닉 사태 때에 마침내 현실화되었다. 이에 천재 기술자인 토르비욘은 원년 오버워치에 고용되었고, 그가 만든 수많은 발명품은 옴닉 사태를 종결짓는 데 크게 공헌하였다. 그 후 몇 년에 걸쳐 오버워치는 세계 평화 수호 부대로 거듭났고, 토르비욘은 기술 부문과 주요 무기 시스템 부문에서 대체 불가능한 인재로 남았다.\n" +
                "하지만 오버워치가 해체된 후, 토르비욘의 무기는 대부분 강탈되거나 세계 각지에 숨겨졌다. 제작자로서 무거운 책임감을 느끼는 토르비욘은 부정한 자들의 손에 무기가 넘어가 무고한 사람들이 피해를 입는 걸 막으려 한다.";
    }

    void widowmaker() {

        name = "widowmaker";
        Korean = "위도우메이커";
        type = "수비";
        Difficuty = "2";
        Introduced = "독가스를 살포하는 지뢰 아군 전체의 시야를 트여주는 적외선 투시경 전자동 모드로 쉽게 전환이 가능한 강력한 저격총까지 갖춘 위도우메이커는 적을 제거하기 위한 장비는 뭐든 보유하고 있다고 할 수 있습니다.";
        ;

        RealName = "아멜리 라크루아";
        age = "33";
        Occupation = "암살자";
        base = "프랑스 안시";
        Affiliation = "탈론";
        subText = "한 방이면 충분해.";


        Name_ab1 = "widows-kiss";
        Korean_ab1 = "죽음의 입맞춤";
        Introduced_ab1 = "위도우메이커의 다기능 저격총은 원거리 목표 저격에 가장 효과적입니다. 하지만 대상이 중거리 범위에 들어오면 전자동 방식으로 사격할 수도 있습니다.";
        ;

        Name_ab2 = "grappling-hook";
        Korean_ab2 = "갈고리 발사";
        Introduced_ab2 = "목표 지점에 갈고리를 발사하여 고정시키고 줄을 당겨 빠르게 해당 지점으로 이동합니다. 이를 통해 전장을 더 폭넓게 조감하면서 적의 공격을 회피하거나 적의 측면을 공격할 수 있습니다.";
        ;

        Name_ab3 = "venom-mine";
        Korean_ab3 = "맹독 지뢰";
        Introduced_ab3 = "빠른 속도로 장전되는 맹독 지뢰는 거의 모든 표면에 접착이 가능합니다. 대상이 지뢰의 감지 범위 내로 접근하면 지뢰가 폭발하며 공기 중으로 맹독을 퍼트려 사거리 내의 모든 적을 중독시킵니다.";
        ;

        Name_ab4 = "infra-sight";
        Korean_ab4 = "적외선 투시";
        Introduced_ab4 = "정찰 보안경을 통해 일정 시간 동안 벽과 장애물 너머에 있는 대상의 열 신호를 감지합니다. 이 시야는 아군과 공유됩니다.";
        //hero


        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";


        mainText="위도우메이커는 더할 나위 없는 암살자다. 참을성 있게 한 순간의 빈틈을 노리고, 아무런 자비 없이 효과적인 살상을 하는 그녀에게는 일말의 감정도 후회도 없다.\n" +
                "위도우메이커로서의 삶을 살기 전의 아멜리는 평범한 여성으로서 오버워치 요원 제라르 라크루아와 결혼했다. 제라르는 당시 \"탈론\"이라는 테러 조직과의 전쟁을 지휘하는 중이었다. 그를 제거하려는 몇 번의 시도가 실패로 돌아간 후 탈론은 그의 부인 아멜리로 목표를 바꿨다. 탈론의 요원들은 그녀를 납치하여 가혹한 신경 조작을 가했으며, 끔찍한 고통 속에서 결국 그녀의 의지는 꺾였다. 의식을 억눌린 채 비밀 요원으로 세뇌된 아멜리는 이후 평상시와 같은 모습으로 오버워치 요원에게 발견되어 일상 생활로 돌아갔다.\n" +
                "그리고 2주 후, 아멜리는 잠자던 제라르를 죽였다.\n" +
                "임무를 완수한 아멜리는 탈론으로 돌아갔고, 그곳에서 그녀는 살아 있는 무기로 다시 태어났다. 오랫동안 잠입술 훈련을 받은 그녀는 생리학적 기질이 근본적으로 변경되어, 심장 박동이 크게 느려지고, 그에 따라 피부가 창백한 푸른빛으로 변하며 인간의 감정을 경험하는 능력이 약화되었다. 그렇게 예전의 아멜리는 어디에도 남지 않았다.\n" +
                "이제 위도우메이커는 탈론의 가장 냉혹한 암살자가 되었고, 임무를 완수하는 순간의 만족감을 제외하면 아무런 감정도 느끼지 못한다.";
    }

    void dva() {
        name = "dva";
        Korean = "디바";
        type = "돌격";
        Difficuty = "2";
        Introduced = "D.Va의 로봇은 날렵하고 강력합니다. 융합포는 근거리에 자동 사격을 퍼붓고 부스터로 적이나 장애물에 돌진하거나 방어 매트릭스로 적이 발사하는 투사체를 무력화시킬 수 있습니다.";
        ;

        RealName = "송하나";
        age = "19";
        Occupation = "프로게이머(예전기록) 로봇 조종사";
        base = "대한민국 부산";
        Affiliation = "대한민국 육군 기동 기갑부대";
        subText = "게임을 하면 이겨야지!";


        Name_ab1 = "fusion-cannons";
        Korean_ab1 = "융합포";
        Introduced_ab1 = "D.Va의 로봇에는 재장전이 필요 없는 근거리 회전포 한 쌍이 장착되어 지속적으로 큰 피해를 줄 수 있습니다. 하지만 포를 발사하는 동안에는 D.Va의 움직임이 느려집니다.";
        ;

        Name_ab2 = "light-gun";
        Korean_ab2 = "광선총";
        Introduced_ab2 = "로봇에 타고 있지 않을 때에는 중거리 자동 광선총으로 적을 공격합니다.";
        ;

        Name_ab3 = "boosters";
        Korean_ab3 = "부스터";
        Introduced_ab3 = "로봇이 전방을 향해 날아갑니다. 부스터를 사용하는 동안 가속도에 의해 계속 앞쪽으로 움직입니다. 방향을 바꾸거나 적 사이를 지나가며 적을 밀쳐낼 수 있습니다.";
        ;

        Name_ab4 = "defense-matrix";
        Korean_ab4 = "방어 매트릭스";
        Introduced_ab4 = "짧은 시간 동안 전방에 표적 레이더를 전개합니다. 레이더가 전개되어 있는 동안 전방에서 날아오는 모든 투사체를 막습니다.";
        ;

        Name_ab5 = "self-destruct";
        Korean_ab5 = "자폭";
        Introduced_ab5 = "로봇에서 탈출하며 로봇 안의 원자로를 폭파시켜 주위의 적에게 엄청난 피해를 줍니다."
        ;

        Name_ab6 = "call-mech";
        Korean_ab6 = "로봇 호출";
        Introduced_ab6 = "로봇이 파괴되면 새로운 로봇을 호출해 다시 전장에 뛰어들 수 있습니다.";
        //hero
        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";
        icon_ab5="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab5+"/icon-ability.png";
        icon_ab6="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab6+"/icon-ability.png";

        mainText="D.Va는 원래 프로게이머로서, 지금은 그 실력을 발휘하여 최첨단 로봇을 조종하며 조국을 수호한다.\n" +
                "20년 전, 제주 남방 해역 깊은 곳에서 튀어나온 거대한 옴닉 괴물이 대한민국을 공격했다. 대한민국은 그 거인 같은 기계를 가까스로 파도 속으로 돌려보냈지만, 그 과정에서 해안가 도시들이 엄청난 피해를 입었다. 이에 대한민국 정부는 미래에 다시 닥칠지도 모를 옴닉의 위협에서 도시를 보호하고자 MEKA라 불리는 중장갑 무인 조종 로봇 부대를 창설했다.\n" +
                "정부의 우려는 기우가 아니었다. 심상치 않은 패턴의 공격이 계속 이어졌다. 몇 년마다 바닷속에서 괴물이 튀어나와 한반도와 그 주변국을 공격했다. 옴닉은 전투를 통해 성장했고, 종종 다른 형태를 취하거나 새로운 무기, 혹은 능력을 보유하고 나타났다. 매번 전투는 교착 상태에 빠졌고, 대한민국은 괴물을 물리치되 파괴하지는 못했다.\n" +
                "옴닉은 계속 진화하여 결국엔 MEKA의 무인 조종 네트워크를 교란하기 시작했고, 대한민국 국군은 로봇에 조종사를 탑승시킬 수밖에 없게 되었다. 황급히 후보를 찾던 정부는 자국의 프로게이머들에게 눈을 돌렸다. 뛰어난 반사신경과 직감을 지닌 프로게이머가 로봇에 탑재된 최첨단 무기 시스템을 다루기에 적합한 후보라 판단한 것이다. 최고의 선수들이 선발되었고, 그중에는 세계 챔피언인 “D.Va”, 송하나도 있었다. 탁월한 실력을 자랑하는 D.Va는 엄청난 집념으로 승리를 쟁취하며, 상대에게 자비를 보이지 않기로 유명한 선수였다.\n" +
                "D.Va는 자신이 맡은 새로운 임무 또한 일종의 게임처럼 여기며, 조국을 지키기 위해 언제든 출동하여 다른 MEKA 부대원들과 함께 대담하게 전장에 돌진한다. 최근 그녀는 사랑하는 팬들을 위해 자신의 전투를 스트리밍하기 시작했고, 추종자가 점점 늘어 감에 따라 세계적인 인기를 얻게 되었다.";
    }

    void orisa() {

        name = "orisa";
        ;
        Korean = "오리사";
        type = "돌격";
        Difficuty = "2";
        Introduced = "오리사는 팀의 중추 역할을 수행하며 최전선에서 보호 방벽으로 팀원들을 보호합니다. 오리사는 원거리에서 공격하며 스스로 자신의 방어력을 강화하고 중력자 구체를 발사해 적을 느리게 하거나 밀칠 수 있으며 초강력 증폭기를 설치하여 모든 아군의 공격력을 동시에 증폭시킬 수 있습니다.";
        ;

        RealName = "오리사";
        age = "1달";
        Occupation = "수호 로봇";
        base = "눔바니";
        Affiliation = "없음";
        subText = "여러분의 안전이야말로 제 의무입니다.";


        Name_ab1 = "fusion-driver";
        Korean_ab1 = "융합 기관포";
        Introduced_ab1 = "전자동 기관포를 연발로 발사합니다. 발사 중에는 움직임이 느려집니다.";
        ;

        Name_ab2 = "fortify";
        Korean_ab2 = "방어 강화";
        Introduced_ab2 = "일정 시간 동안 받는 피해가 감소하고 저지 불가 상태가 됩니다.";
        ;

        Name_ab3 = "halt";
        Korean_ab3 = "꼼짝 마!";
        Introduced_ab3 = "중력자 구체를 발사하고 격발시켜 근처의 적을 끌어당기고 느려지게 합니다.";
        ;

        Name_ab4 = "protective-barrier";
        Korean_ab4 = "보호 방벽";
        Introduced_ab4 = "자신과 아군을 적의 화력으로부터 보호하는 고정 방벽을 던집니다.";
        ;

        Name_ab5 = "supercharger";
        Korean_ab5 = "초강력 증폭기";
        Introduced_ab5 = "오리사가 시야 안에 있는 모든 아군의 공격력을 증폭시킵니다.";
        //hero

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";
        icon_ab5="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab5+"/icon-ability.png";
        mainText="짧은 시간 동안 눔바니의 방어 로봇이었던 OR15의 부품으로 만들어진 오리사는 아직 배울 점이 많지만, 새롭게 탄생한 도시의 수호자이다.\n" +
                "옴닉 사태 이전부터 투입됐던 OR14 “이디나” 보안 로봇은 나이지리아의 거대한 옴니움에서 생산됐다가, 전쟁이 끝난 뒤에는 옴닉 사태에 투입됐던 다른 모델들과 함께 생산이 중지되었다. 20년 후, 눔바니는 외부 위협으로부터 도시를 보호하기 위해 OR14 프로그램을 부활시켰다. 이렇게 탄생한 OR15 모델은 둠피스트의 공격을 받아 파괴되기 전까지 짧은 시간 동안 도시를 지켰다.\n" +
                "둠피스트의 공격 이후, OR15 프로그램은 백지화되었으며, 도시 행정부는 남은 OR15의 재고를 판매하였다. 부품을 구입한 자들 중에는 11살짜리 천재 소녀, 에피 올라델레도 있었다. 에피는 로봇공학과 인공지능 분야에서 놀라운 성과를 이뤄내며, 아다위 재단의 “영재 지원상”을 수상하기도 했다.\n" +
                "열린 사고를 가진 부모님의 허락과 지원 아래, 에피는 지원금의 대부분을 폐기된 OR15 로봇을 구매하는 데 썼다. 에피는 눔바니를 보호할 존재가 필요하고, 업그레이드된 OR15라면 그 일을 해낼 수 있을 거라 믿었던 것이다. 에피는 로봇을 개조하며 직접 설계한 인격 코어를 설치했다.\n" +
                "에피는 눔바니의 새로운 영웅에게 오리사라는 이름을 주었다.\n" +
                "오리사는 눔바니를 위해 일하면서도 자신에게 최적화된 프로토콜을 찾기 위해 애쓰고 있다. 옴닉인 오리사는 경험 부족으로 가끔 문제를 일으키기도 한다. 다행히도, 적응에 뛰어난 오리사의 인공지능과 필요할 때마다 직접 개조에 나서는 에피의 의지 아래, 오리사와 에피는 빠짐없이 문제를 바로잡아 왔다.\n" +
                "수호자로서 활동을 시작한 만큼, 아직 오리사는 세상과 자신의 기능에 대해 알아야 할 부분이 많다. 하지만 워낙 낙천적인 성격인 에피의 도움과 서서히 커져가는 명예감과 의무감으로, 오리사는 무슨 일이 있어도 눔바니와 자신의 창조자를 지킬 준비가 되어 있다.";
    }

    void reinhardt() {
        name = "reinhardt";
        Korean = "라인하르트";
        type = "돌격";
        Difficuty = "1";
        Introduced = "강화 갑주를 걸치고 망치를 휘두르는 라인하르트는 로켓으로 추진력을 얻어 전장을 가로지르며 적에게 돌진하며 거대한 에너지 방벽으로 아군을 보호합니다.";
        ;
        RealName = "라인하르트";
        age = "61";
        Occupation = "모험가";
        base = "독일 슈투트가르트";
        Affiliation = "오버워치(예전기록)";
        subText = "정의의 이름으로.";


        Name_ab1 = "rocket-hammer";
        Korean_ab1 = "로켓 해머";
        Introduced_ab1 = "라인하르트의 로켓 해머는 모범적인 근접 무기로 폭넓은 곡선을 그리며 휘둘러 무시무시한 피해를 줄 수 있습니다.";
        ;

        Name_ab2 = "shield";
        Korean_ab2 = "방벽 방패";
        Introduced_ab2 = "전면에 넓은 에너지 방패를 투사합니다. 방패는 파괴될 때까지 피해를 흡수합니다. 라인하르트는 자신과 동료를 방패로 가려 보호할 수 있지만 방패를 투사하는 동안 공격을 할 수 없습니다.";
        ;

        Name_ab3 = "charge";
        Korean_ab3 = "돌진";
        Introduced_ab3 = "전방을 향해 직선으로 돌진하여 경로에 있는 적을 붙잡습니다. 라인하르트가 벽에 충돌하면 붙잡힌 적이 큰 피해를 받습니다.";
        ;

        Name_ab4 = "fire-strike";
        Korean_ab4 = "화염 강타";
        Introduced_ab4 = "로켓 해머를 휘둘러서 불타는 투사체를 날립니다. 투사체는 적을 관통하며 피해를 줍니다.";


        Name_ab5 = "earth-shatter";
        Korean_ab5 = "대지분쇄";
        Introduced_ab5 = "로켓 해머로 강하게 땅을 내리쳐 전방의 모든 적을 넘어뜨리고 피해를 줍니다.";
        //hero

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";
        icon_ab5="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab5+"/icon-ability.png";
        mainText="라인하르트 빌헬름은 옛 용사를 본받아, 용맹, 정의, 용기라는 기사도의 미덕을 따른다.\n" +
                "삽십여 년 전, 세계적인 로봇 반란의 위협에 대처하기 위해 오버워치가 설립되었다. 숱한 훈장을 자랑하는 독일 군인 라인하르트는 옴닉 사태를 종식시키기 위한 원년 오버워치 기동대의 일원이었다. 사태 종식 후 오버워치는 전 세계적 기관으로 성장하여, 전쟁의 상흔을 입은 세계의 평화를 지켰다. 라인하르트는 이 조직에서 가장 강직한 용사임을 증명한 바 있다.\n" +
                "라인하르트는 특유의 도덕성과 기개로 동료는 물론 상관의 경의까지 얻었다. 늘 주저 없이 자신의 뜻을 밝히는 그는, 오버워치를 강력히 옹호하는 한편으로 필요하다면 엄격히 비판하기도 하면서 오버워치가 선을 추구하는 세력임을 끊임없이 주지시켰다.\n" +
                "50대 후반까지 오버워치에 복무한 라인하르트는 실전 임무에서 물러날 수밖에 없었다. 현역에서 은퇴한 라인하르트는 목적과 영광을 따르던 나날이 끝이 났다고 생각하여 낙담하였다. 시대가 암울해지면서 오버워치는 부패에 빠져 대중을 선동한다는 의혹을 받기에 이르렀지만, 라인하르트는 자신이 평생을 바쳐 지킨 대의가 불명예에 물드는 것을 그저 지켜볼 수밖에 없었다.\n" +
                "오버워치는 끝내 해체되었으나, 라인하르트는 세계가 무질서 상태에 빠지는 것을 가만히 보고 있을 수 없었다. 그는 다시 크루세이더 갑주를 걸치고 유럽을 누비며 그 옛날의 기사와도 같이 정의를 위해 싸우기를 맹세하고, 무고한 이들을 보호하고 더 밝은 미래에 대한 꿈을 심어 주고 있다.";
    }

    void roadhog() {
        name = "roadhog";
        Korean = "로드호그";
        type = "돌격";
        Difficuty = "1";
        Introduced = "로드호그는 갈고리 사슬로 적을 가까이 끌어당기고 고철총으로 산산조각냅니다. 그는 엄청난 피해를 버틸 수 있으며 짧은 숨 돌리기 만으로도 어마어마한 생명력을 회복할 수 있습니다.";
        ;

        RealName = "마코 러틀리지";
        age = "48";
        Occupation = "집행자(예전기록) 경호원 ";
        base = "호주 쓰레기촌(예전기록)";
        Affiliation = "쓰레기들(예전기록)";
        subText = "나는 재앙을 불러온다.";


        Name_ab1 = "scrap-gun";
        Korean_ab1 = "고철총";
        Introduced_ab1 = "넓게 퍼지는 고철 파편을 근거리에 발사합니다. 보조 발사로는 중거리까지 날아가 터지며 파편을 퍼뜨리는 파편 뭉치를 발사합니다.";
        ;

        Name_ab2 = "take-a-breather";
        Korean_ab2 = "숨 돌리기";
        Introduced_ab2 = "짧은 시간에 걸쳐 생명력을 회복합니다.";
        ;

        Name_ab3 = "chain-hook";
        Korean_ab3 = "갈고리 사슬";
        Introduced_ab3 = "대상에게 갈고리 사슬을 던집니다. 대상이 갈고리에 걸리면 자신 쪽으로 확 잡아당깁니다.";
        ;

        Name_ab4 = "whole-hog";
        Korean_ab4 = "돼재앙";
        Introduced_ab4 = "고철총에 깔때기를 꽂고 고철을 부은 다음 적들을 밀쳐내는 고철 파편을 일정 시간 동안 퍼붓습니다.";
        //hero

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="로드호그는 무자비한 살인마이며, 그 잔혹함과 파괴적인 성향으로 악명이 자자하다.\n" +
                "옴닉 사태 이후, 호주 정부는 조국을 거의 파괴하다시피 한 옴닉들에게 호주 옴니움과 그 주변 땅을 내주고 장기간의 평화 협정을 맺으려 했다. 이 협정으로 마코 러틀리지를 비롯해 호주 내륙에 점점이 흩어져 살고 있던 생존주의자, 태양광 발전 종사자들, 그리고 그저 조용히 홀로 살고 싶었던 수많은 거주민은 영영 내륙 밖으로 추방되었다.\n" +
                "집을 잃고 격분한 마코와 거주민들은 거센 폭동을 일으켰다. 이들은 호주 해방 전선을 형성하고 옴니움과 로봇을 공격하여 빼앗긴 땅을 되찾으려 했다. 폭동은 그 기세를 더해갔고, 결국 이들은 옴니움의 핵융합로를 파괴하기에 이른다. 이 폭발은 시설을 파괴했고, 주변 지역을 방사능에 오염시켰으며, 수천 킬로미터 주위를 뒤틀린 고철과 잔해로 뒤덮었다.\n" +
                "마코는 고향이 황무지로 변하는 대참사를 두 눈으로 목격하고는 영영 다른 사람이 되어버렸다.\n" +
                "마코는 가면을 뒤집어쓴 채 고물 바이크를 타고 호주 내륙의 부서진 도로 위를 달리고 또 달리며 환경에 적응해갔다. 그 과정에서 그의 인간성은 조금씩 사라지고 있었다. 그리고 마침내 마코의 마지막 흔적이 사라지던 날, 잔혹한 살인마 로드호그가 태어났다.";
    }

    void winston() {

        name = "winston";
        Korean = "윈스턴";
        type = "돌격";
        Difficuty = "2";
        Introduced = "윈스턴은 점프 팩 전기를 발산하는 테슬라 캐논 휴대용 방벽 생성기처럼 탁월한 발명품들을 사용합니다. 그리고 당연히 일반적인 고릴라의 힘도 보유하고 있습니다.";
        ;

        RealName = "윈스턴";
        age = "29";
        Occupation = "과학자 모험가";
        base = "호라이즌 달 기지(예전기록)";
        Affiliation = "오버워치(예전기록)";
        subText = "상상력이야말로 발견의 어머니입니다.";


        Name_ab1 = "tesla-cannon";
        Korean_ab1 = "테슬라 캐논";
        Introduced_ab1 = "방아쇠를 누르고 있으면 근거리에 전기를 발사합니다.";
        ;

        Name_ab2 = "jump-pack";
        Korean_ab2 = "점프 팩";
        Introduced_ab2 = "에너지 팩을 이용해 공중으로 떠오릅니다. 지면에 착지할 때 주위 적들을 기절시키고 큰 피해를 줍니다.";
        ;

        Name_ab3 = "shield-projector";
        Korean_ab3 = "방벽 생성기";
        Introduced_ab3 = "거품 모양의 방벽을 펼칩니다. 방벽은 파괴될 때까지 피해를 흡수합니다. 아군은 방벽 안에서 적을 공격할 수 있습니다.";
        ;

        Name_ab4 = "primal-rage";
        Korean_ab4 = "원시의 분노";
        Introduced_ab4 = "동물의 본성을 받아들여 엄청난 생명력을 얻고 쉽게 죽지 않는 상태가 됩니다. 근접 공격이 강화되고 점프 팩을 더 자주 사용할 수 있게 됩니다. 분노한 동안 윈스턴은 근접 공격 및 점프 팩 공격만을 할 수 있습니다.";
        //hero

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="윈스턴은 극도로 지적인, 유전자 조작 고릴라이다. 그는 훌륭한 과학자이자 인류 잠재력의 강력한 옹호자이다.\n" +
                "호라이즌 달 기지는 인류가 우주 탐험 재개의 첫걸음으로 건설한 시설이었다. 기지에는 유전자 강화 고릴라들도 있었는데, 이는 우주에서 오래 생활한 생명체에게 어떤 현상이 나타나는지 알아보기 위함이었다.\n" +
                "해롤드 윈스턴 박사의 감독 아래 유전자 요법을 받던 이 고릴라들 중 하나가 엄청난 두뇌 발달을 보였다. 박사는 그에게 과학을 가르치고, 인간의 천재성을 보여주는 이야기들로 그를 자극했다. 젊은 고릴라는 매일같이 과학자들의 실험을 돕고 자기 서식처 창문 너머 멀리 보이는 푸른 행성을 바라보면서, 그곳에서 자신을 기다리는 무한한 가능성을 꿈꿨다.\n" +
                "하지만 다른 고릴라들이 폭동을 일으켜 과학자들을 죽이고 기지를 차지하면서 그의 삶은 갑자기 혼돈에 빠져들었다. 그는 깊이 사랑하고 따르던 보호자인 윈스턴의 이름을 이어받고 로켓을 급조해 지구로 탈출했다. 그곳에서 윈스턴은 자신이 경탄하던 인류의 모든 가치를 대변하는 조직, 오버워치를 만나 그 안에서 새로운 자리를 찾았다. 마음속 깊이 스며든 영웅적인 이상에 따른 삶을 비로소 살 수 있게 된 것이다.\n" +
                "오버워치가 해체되면서 윈스턴은 다시 한 번 자신이 꿈꾸는 세상에서 분리되어 은둔 생활에 들어갔다. 하지만 그는 영웅적인 삶을 살 수 있는 날이 다시 돌아오기를 애타게 바라고 있다.";
    }

    void zarya() {
        name = "zarya";
        Korean = "자리야";
        type = "돌격";
        Difficuty = "3";
        Introduced = "강력한 개인용 방벽을 전개하여 받은 피해를 흡수하고 그 힘을 강력한 입자포로 발산하는 자리야는 전장의 최전선에서 빠질 수 없는 자원입니다.";
        ;

        RealName = "알렉산드라 자리야노바";
        age = "28";
        Occupation = "군인";
        base = "러시아 크라스노야르스크 최전선";
        Affiliation = "러시아 방위군";
        subText = "함께일 때 우린 강합니다.";


        Name_ab1 = "particle-cannon";
        Korean_ab1 = "입자포";
        Introduced_ab1 = "파괴적인 에너지 광선을 근거리에 방출합니다. 광선 대신 입자탄을 발사해 다수의 적에게 피해를 줄 수도 있습니다.";
        ;

        Name_ab2 = "particle-barrier";
        Korean_ab2 = "입자 방벽";
        Introduced_ab2 = "입자포에서 개인용 방벽을 펼칩니다. 이 방벽은 자리야가 받는 공격을 막아내는 동시에 받은 공격 에너지를 전환해 입자포의 공격력을 올리고 광선의 폭을 넓힙니다.";
        ;

        Name_ab3 = "projected-barrier";
        Korean_ab3 = "방벽 씌우기";
        Introduced_ab3 = "아군 한 명에게 에너지 방벽을 씌워 적의 공격을 흡수하고 입자포의 위력을 강화합니다.";
        ;

        Name_ab4 = "graviton-surge";
        Korean_ab4 = "중력자탄";
        Introduced_ab4 = "중력 폭탄을 발사하여 적들을 끌어당기고 끌려들어간 적들에게 피해를 줍니다.";
        //hero

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="알렉산드라 자리야노바는 세계에서 가장 강인한 여성 중 하나다. 그녀는 한때 장래가 촉망되던 운동선수였으나, 전쟁이 일어나자 개인의 영광을 버리고 가족과 친구, 조국을 지키기 위해 나선다.\n" +
                "알렉산드라는 삼십여 년 전에 발발한 옴닉 사태의 최전선에 위치한 시베리아의 외딴 마을에서 태어났다. 러시아 군대가 로봇들을 파괴하고 옴니움을 폐쇄하긴 했지만 그 지역은 이미 초토화된 후였다. 당시 아이였던 알렉산드라는 전쟁의 상흔을 피부로 느끼며 성장했고, 훗날 자신이 힘을 키워 동포의 재기를 돕겠다고 맹세했다.\n" +
                "역도와 보디빌딩에 열중한 알렉산드라는 국가적인 체육 인재 양성 프로그램의 유망주로 선발되었다. 훈련에 정진한 그녀는 마침내 조국을 대표하는 인재로 성장하였고, 다음 세계 선수권 대회에서는 오래도록 난공불락이었던 세계 기록을 깰 거라는 기대를 한 몸에 받았다.\n" +
                "하지만 대회 전날, 오랫동안 휴면 상태였던 시베리아의 옴니움에서 공격이 시작됐고, 알렉산드라의 마을은 다시금 전쟁의 소용돌이에 휘말렸다. 이 소식을 들은 알렉산드라는 즉시 대회를 기권하고 고향의 방위군에 합류했다. 단 하루면 손에 넣었을 모든 부와 명예를 뒤로한 채.\n" +
                "이제 사람들은 알렉산드라를 조국의 상징으로 여기기도, 믿음직한 동료 군인으로 생각하기도 한다. 하지만 알렉산드라는 그저 자신의 힘으로 사랑하는 이들을 지키려는 것뿐이다.";


    }

    void ana() {
        name = "ana";
        Korean = "아나";
        type = "지원";
        Difficuty = "3";
        Introduced = "아나는 생체 소총 생체 수류탄 수면총 등 다양한 장비를 활용해 원거리에서 아군을 치유하거나 강화할 수 있으며 동시에 적들을 무력화시킬 수 있습니다.";
        ;

        RealName = "아나 아마리";
        age = "60";
        Occupation = "현상금 사냥꾼";
        base = "이집트 카이로";
        Affiliation = "오버워치(예전기록)";
        subText = "누구나 삶의 목적을 찾아야 돼.";


        Name_ab1 = "biotic-rifle";
        Korean_ab1 = "생체 소총";
        Introduced_ab1 = "아군은 치유하고 적에게는 피해를 주는 투사체를 발사합니다. 저격 조준경으로 적중률을 높일 수 있습니다.";
        ;

        Name_ab2 = "sleep-dart";
        Korean_ab2 = "수면총";
        Introduced_ab2 = "보조 무기인 수면총을 발사하여 적을 잠에 빠뜨립니다. 잠든 적은 피해를 입으면 즉시 깨어납니다.";
        ;

        Name_ab3 = "biotic-grenade";
        Korean_ab3 = "생체 수류탄";
        Introduced_ab3 = "생체 수류탄을 던져 좁은 범위 안의 아군은 치유하고 적에게는 피해를 줍니다. 생체 수류탄에 적중당한 아군은 잠시 동안 받는 치유 효과가 증폭되며 적은 잠시 동안 치유 효과를 받을 수 없습니다";
        ;

        Name_ab4 = "stim-boost";
        Korean_ab4 = "나도 강화제";
        Introduced_ab4 = "아군 한 명에게 전투 강화제를 투여하여 일시적으로 공격력을 증가시키고 받는 피해를 감소시킵니다.";
        //hero

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="아나는 오버워치 창립 멤버 중 하나로서, 탁월한 전투 능력과 노련함으로 고향과 자신에게 가장 소중한 이들을 지킨다.\n" +
                "옴닉 사태가 이집트에 엄청난 타격을 주게 되자, 자원과 병력이 부족했던 이집트 국방부는 최정예 저격수들의 활약에 의지할 수밖에 없었다. 이 중엔 이미 세계 최고의 저격수로 이름을 떨치던 아나 아마리도 있었다. 사격술, 판단력, 천재성을 인정받은 그녀는 자연스럽게 오버워치 기동 타격대에 합류하게 되었고, 결국 전쟁을 종결지었다.\n" +
                "임무를 성공적으로 수행한 아나는 강습 사령관 모리슨의 부사령관 역할을 수행하며 수년을 복무했다. 조직을 이끄는 책임을 지고 있었음에도 아나는 실전에 직접 나서길 원했으며, 50대까지도 직접 작전을 수행했다. 하지만 인질 구출 임무 중 \"위도우메이커\"로 알려진 탈론 요원에게 살해당한 것으로 알려졌다.\n" +
                "사실 아나는 치명상을 입고 오른쪽 눈을 잃었으나 죽은 것은 아니었다. 아나는 회복 기간 동안 전투가 전부였던 삶의 무게에 괴로워했고, 점차 확산되는 세상의 분쟁에 관여하지 않기로 결정했다. 하지만 시간이 지나자, 아나는 고향과 주위의 무고한 이들이 위협받는 걸 방관할 순 없다는 것을 깨달았다.\n" +
                "이렇게 아나는 다시 전투에 합류했다. 조국을 악의 무리로부터 수호하고, 그 무엇보다 소중한 그녀의 가족과 동료들을 지키기 위해.";

    }

    void lucio() {
        name = "lucio";
        Korean = "루시우";
        type = "지원";
        Difficuty = "2";
        Introduced = "루시우는 전장에서 최첨단 음파 증폭기로 적에게 투사체를 발사하거나 적들을 멀리 밀쳐낼 수 있습니다. 루시우의 음악은 아군을 치유하거나 이동 속도를 높여줄 수 있으며 도중에 전환할 수 있습니다.";
        ;

        RealName = "루시우 코헤이아 도스 산토스";
        age = "26";
        Occupation = "DJ 자유의 투사";
        base = "브라질 리우데자네이루";
        Affiliation = "없음";
        subText = "힘내. 우린 할 수 있어!";


        Name_ab1 = "sonic-amplifier";
        Korean_ab1 = "음파 증폭기";
        Introduced_ab1 = "음파 투사체를 발사합니다. 소리의 파동으로 적들을 밀쳐낼 수도 있습니다.";
        ;

        Name_ab2 = "crossfade";
        Korean_ab2 = "분위기 전환!";
        Introduced_ab2 = "루시우는 자신과 주위 팀원들의 기운을 북돋는 두 음악을 바꿔가며 틀 수 있습니다. 하나는 이동 속도를 증가시키고 다른 하나는 생명력을 회복시킵니다.";
        ;

        Name_ab3 = "amp-it-up";
        Korean_ab3 = "볼륨을 높여라!";
        Introduced_ab3 = "스피커의 볼륨을 높여 음악의 효과를 증폭시킵니다.";
        ;

        Name_ab4 = "sound-barrier";
        Korean_ab4 = "소리 방벽";
        Introduced_ab4 = "루시우의 음파 증폭기에서 보호의 물결이 방출되어 자신과 근처 아군에게 일시적으로 보호막을 씌웁니다.";
        //hero

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="루시우는 음악과 행동으로 사회 변화를 주도하는 세계적인 유명인사다.\n" +
                "루시우 코헤이아 도스 산토스는 옴닉 사태 직후 재정 문제에 시달리던 리우데자네이루의 번잡한 빈민가에서 자랐다. 브라질이 기나긴 재건 과정에 들어서자, 루시우는 주변 이웃들의 기운을 북돋아주고 싶었다. 루시우는 그 답을 음악에서 찾았다. 음악은 사람들을 하나로 모으고, 잠시나마 자신에게 닥친 문제를 잊게 해주는 힘이 있었다. 루시우는 길 모퉁이, 동네 파티에서 공연했고, 성장한 후에는 언더그라운드에서 전설로 남은 공연들을 여러 번 펼쳤다.\n" +
                "하지만 루시우의 끈끈했던 공동체는 세계적 기업인 비슈카르 코퍼레이션이 도시 대부분의 재개발 계약권을 확보한 후 혼란에 빠졌다. 루시우와 이웃들은 재개발로 삶이 향상될 거라는 약속을 받았으나 이는 거짓이었다. 비슈카르 사는 보다 질서정연한 사회를 구성한다는 명목 아래 주민들의 목을 옥죄기 시작했다. 비슈카르 사는 통행 금지 시간을 만들었고, 회사가 불법으로 간주하는 행위는 모조리 탄압했으며, 주민에게 형편없는 임금을 주고 노동력을 착취했다.\n" +
                "이 상황을 참을 수 없었던 루시우는 사람들을 제압할 때 쓰이던 비슈카르 사의 음파 장비를 훔쳐서 개조하고 시위운동을 주도하는 도구로 활용했다. 시위는 열기를 더했고, 결국 이들은 도시에서 비슈카르 사를 몰아내는 데 성공했다. 이때 루시우가 보여준 통솔력은 루시우를 하루아침에 유명인으로 만들었고, 그는 긍정적인 사회 운동의 상징으로 추앙 받았다. 루시우가 제작한 음악 또한 인기가 치솟아, 한때 고향에서 공연하던 그는 이제 전 세계의 공연장을 인파로 가득 채운다.\n" +
                "이제 유명해진 루시우는 자신에게 변화를 이끌고 더 좋은 세상을 만들 힘이 있다고 믿는다.";

    }

    void mercy() {
        name = "mercy";
        Korean = "메르시";
        type = "지원";
        Difficuty = "1";
        Introduced = "발키리 슈트 덕에 메르시는 아군을 마치 수호 천사처럼 가까이에서 지킬 수 있습니다. 또한 카두세우스 지팡이로 아군을 치유 부활 또는 강화할 수 있습니다.";
        ;

        RealName = "앙겔라 치글러";
        age = "37";
        Occupation = "야전 의무장교 긴급 구조 요원";
        base = "스위스 취리히";
        Affiliation = "오버워치(예전기록)";
        subText = "영웅은 죽지 않아요.";


        Name_ab1 = "caduceus-staff";
        Korean_ab1 = "카두세우스 지팡이";
        Introduced_ab1 = "아군에게 연결되는 두 가지 광선 중 하나를 사용합니다. 광선을 계속 유지하면 그 아군의 생명력을 회복하거나 아군이 주는 피해를 증가시킬 수 있습니다.";
        ;

        Name_ab2 = "caduceus-blaster";
        Korean_ab2 = "카두세우스 블라스터";
        Introduced_ab2 = "보조 무기로 탄알을 발사합니다. 응급 개인 방어용으로 아껴두는 것이 좋습니다.";
        ;

        Name_ab3 = "guardian-angel";
        Korean_ab3 = "수호천사";
        Introduced_ab3 = "아군에게 빠르게 다가가 결정적인 순간에 도움을 줄 수 있도록 대상 아군을 향해 날아갑니다.";
        ;

        Name_ab4 = "angelic-descent";
        Korean_ab4 = "천사 강림";
        Introduced_ab4 = "발키리 슈트의 추진력을 이용해 높은 곳에서 떨어질 때 낙하 속도를 감소시킵니다.";
        ;

        Name_ab5 = "resurrect";
        Korean_ab5 = "부활";
        Introduced_ab5 = "회복의 힘을 분출하여 근처의 쓰러진 아군을 생명력이 모두 회복된 상태로 부활시킵니다. 부활 시전 중에는 일시적으로 무적 상태가 됩니다.";
        //hero

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";
        icon_ab5="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab5+"/icon-ability.png";

        mainText="수호천사와도 같이 사람을 보살피는 앙겔라 치글러 박사는 발군의 치유사이자 뛰어난 과학자, 열성적인 평화주의자이다.\n" +
                "치글러는 명망 있는 스위스의 병원에서 외과 과장으로 승진한 후, 나노생물학 분야에서 획기적인 발견을 해내 치명적인 질병 및 부상의 치료에 크게 공헌하였다. 이러한 전문성이 오버워치의 관심을 끌었다.\n" +
                "전쟁 중에 부모를 잃은 치글러는 군사력으로 세계 평화를 유지한다는 오버워치의 방침에 반발하였다. 그러나 결국, 오버워치가 크게 보면 더욱 많은 생명을 구할 기회를 준다는 사실을 깨닫게 되었다. 오버워치의 의학 연구 책임자로서, 앙겔라는 최전선 위기 상황에서의 치료 기술을 향상시키는 연구에 박차를 가했다. 그 결과 탄생한 것이 발키리 신속 반응 슈트로, 치글러 스스로 이것을 숱한 오버워치 임무에서 시험한 바 있다.\n" +
                "치글러는 오버워치에서 중책을 맡고 있음에도 상관들과, 그리고 조직의 큰 목표와 충돌하곤 했다. 오버워치가 해체된 후로는 전쟁에서 상처를 받은 자들을 돕는 데 전념하고 있다.\n" +
                "치글러 박사는 대개 전 세계의 위기 지역에서 망가지고 소외된 이들을 돌보며 시간을 보내지만, 무고한 이들이 위험에 처하면 발키리 슈트를 입고 활약하기를 망설이지 않는다.";

    }

    void symmetra() {
        name = "symmetra";
        Korean = "시메트라";
        type = "지원";
        Difficuty = "2";
        Introduced = "시메트라는 광자 발사기로 적을 처치하며, 아군에게 보호막을 씌우고 순간이동기와 감시 포탑을 설치할 수 있습니다.";
        ;

        RealName = "사티아 바스와니";
        age = "28";
        Occupation = "광축가";
        base = "인도, 유토페아";
        Affiliation = "비슈카르 코퍼레이션";
        subText = "인류의 진정한 적은 무질서예요.";


        Name_ab1 = "photon-projector";
        Korean_ab1 = "광자 발사기";
        Introduced_ab1 = "근처의 적을 따라가며 지속적인 피해를 주는 근거리 광선을 발사합니다. 광선이 오래 지속될수록 피해가 커집니다. 또한 충전된 에너지 구체를 방출해 큰 피해를 줄 수도 있습니다.";
        ;

        Name_ab2 = "sentry-turret";
        Korean_ab2 = "감시 포탑";
        Introduced_ab2 = "작은 포탑을 설치합니다. 포탑은 범위 내 가장 가까운 적을 공격해 느려지게 합니다. 동시에 여러 개의 포탑을 세울 수 있습니다.";
        ;

        Name_ab3 = "photon-shield";
        Korean_ab3 = "광자 방벽";
        Introduced_ab3 = "앞으로 전진하며 피해를 흡수하는 방벽을 발사합니다.";
        ;

        Name_ab4 = "teleporter-pad";
        Korean_ab4 = "순간이동기";
        Introduced_ab4 = "시메트라가 현재 위치에 순간이동기 출구를 설치합니다. 출구는 팀 시작 위치에 있는 순간이동기 입구와 연결됩니다. 아군은 순간이동기 입구에서 출구로 즉시 이동하여 전장에 빠르게 합류할 수 있습니다.";


        Name_ab5 = "shield-generator";
        Korean_ab5 = "보호막 생성기";
        Introduced_ab5 = "넓은 반경의 팀 전체에게 추가 보호막을 부여하는 장치를 설치합니다";


       img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="시메트라는 말 그대로 현실을 뒤튼다. 그녀는 완벽한 사회를 구현하겠다는 희망 아래, 경화광으로 이루어진 구조물을 창조해 자신이 바라는 세계를 형성한다.\n" +
                "옴닉 사태 이후, 인도 남부에 위치한 기업인 비슈카르에서는 나라에 넘쳐나는 난민들을 수용할 수 있는 새롭고 자족적인 도시들을 만드는 힘겨운 작업에 착수했다. 그런 도시 중 하나인 유토페아는 급진적인 경화광 테크놀로지를 이용해 광축가들이 눈 깜짝할 사이에 거리, 시설, 거주지를 만들어낸 도시이다.\n" +
                "어린 사티아 바스와니는 빛을 다루는 희귀한 능력이 있음이 밝혀진 후, 다시는 집에 돌아가지 않는다는 조건으로 극빈한 환경에서 벗어나 비슈카르의 광축가 아카데미의 보호를 받게 되었다. 외롭고 고립된 새 삶을 살게 된 사티아는 공부와 훈련에 몰두했다. 그녀는 금세 경화광 기술의 활용법을 익혔고, 반에서 최고의 학생이 되었다. 사티아는 경화광을 다루는 데 있어서 동료들과는 조금 다른 방식을 사용했다. 정해진 절차에 따라 기계적으로 구조물을 건설하는 게 아니라, 고향의 전통적인 춤 동작으로 구조물을 엮어 나갔던 것이다.\n" +
                "사티아는 유토페아 최고의 광축가 중 하나였지만, 비슈카르는 그녀에게 더 큰 잠재력이 있다고 판단했다. 그녀는 회사에서 \"시메트라\"라는 이름을 받아, 기업의 이익을 지키고 다른 나라들에 대한 영향력을 키우는 비밀 임무를 세계 곳곳에서 수행하게 되었다.\n" +
                "시메트라는 자신의 행동이 사회의 더 큰 선을 위한 것이라 믿고 있다. 하지만 때로는 자신이 바라는 통제와 질서가 진정 인류에게 최선인지 의심하기도 한다.";
    }

    void zenyatta() {
        name = "zenyatta";
        Korean = "젠야타";
        type = "지원";
        Difficuty = "3";
        Introduced = "젠야타는 조화의 구슬로 아군 팀을 치유하고 부조화의 구슬로 적을 약화할 뿐만 아니라 초월로 잠시 모든 피해에 면역이 될 수 있습니다.";
        ;

        RealName = "테카르타 젠야타";
        age = "20";
        Occupation = "떠돌이 구루 모험가";
        base = "네팔 샴발리 수도원(예전기록)";
        Affiliation = "샴발리 수도원(예전기록)";
        subText = "진정한 자아엔 형체가 없는 법.";


        Name_ab1 = "orb-of-destruction";
        Korean_ab1 = "파괴의 구슬";
        Introduced_ab1 = "파괴적인 힘이 담긴 구슬을 던집니다. 구슬은 하나를 던질 수도 있고 몇 초 동안 힘을 모았다가 여럿을 빠르게 던질 수도 있습니다.";
        ;

        Name_ab2 = "orb-of-harmony";
        Korean_ab2 = "조화의 구슬";
        Introduced_ab2 = "구슬을 내보내 대상 아군의 어깨 위에 맴돌게 합니다. 구슬은 젠야타가 생존해 있는 동안 대상 아군의 생명력을 서서히 회복시킵니다. 한 번에 하나의 아군 대상만이 구슬의 효과를 받습니다.";
        ;

        Name_ab3 = "orb-of-discord";
        Korean_ab3 = "부조화의 구슬";
        Introduced_ab3 = "적에게 부조화의 구슬을 부착시켜 받는 피해를 증폭시킵니다. 젠야타가 살아있는 한 유지됩니다. 한 번에 하나의 적 대상만이 구슬의 효과를 받습니다.";
        ;

        Name_ab4 = "transcendence";
        Korean_ab4 = "초월";
        Introduced_ab4 = "잠시 동안 현세를 초월한 존재가 됩니다. 이 시간 동안 모든 피해에 면역이 되며 자동으로 자신 및 주위 아군의 생명력을 회복시키지만 다른 능력이나 무기는 사용할 수 없습니다.";
        //hero

        img="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/hero-select-portrait.png";
        icon_ab1="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab1+"/icon-ability.png";
        icon_ab2="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab2+"/icon-ability.png";
        icon_ab3="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab3+"/icon-ability.png";
        icon_ab4="https://blzgdapipro-a.akamaihd.net/hero/"+name+"/ability-"+Name_ab4+"/icon-ability.png";

        mainText="젠야타는 정신적 깨달음을 위해 온 세계를 방랑하는 옴닉의 수도사다. 그와 만나는 사람은 모두 전혀 다른 존재로 다시 태어난다는 말이 있다.\n" +
                "수년 전, 옴닉 사태 직후 한 무리의 추방된 옴닉 로봇들이 소위 정신적 각성이라 부르는 실험을 수행했다. 이들은 사전에 프로그램된 삶을 버리고 히말라야 산 깊은 곳에 수도원을 건설하여 공동 생활을 시작했다. 존재의 본질에 대해 오랫동안 명상한 후, 이들은 스스로가 인공지능 이상의 존재이며, 자신들도 인간과 마찬가지로 영혼의 정수를 지니고 있다는 믿음을 갖게 되었다.\n" +
                "인간과 영적으로 동일한 존재라는 믿음을 갖게 된 후, 테카르타 몬다타라는 이름의 신비한 로봇이 이끄는 수도사들은 한 세기 전의 옴닉 사태가 남긴 상처를 치유하고 인간과 로봇이 조화를 이루는 사회를 만들기 위한 활동을 시작했다. 수백만 명의 사람들이 이들의 메시지를 받아들였고, 이들은 전 세계에 걸쳐 유명 인사가 되었다.\n" +
                "하지만 젠야타는 이와 같은 방향에 동조하지 않았다. 그는 인간과 옴닉 사이의 갈등을 해소할 길은 교조적인 가르침에 있는 것이 아니라, 개체와 개체 사이의 교감과 어울림에 있다고 믿었다.\n" +
                "결국 젠야타는 자신만의 길을 떠났다. 그는 수도원을 떠나 전 세계를 방랑하며, 만나는 사람들이 자신의 개인적인 문제를 해결하고 내면의 평화를 찾도록 돕고 있다. 하지만 누군가 도움이 필요할 때면, 젠야타는 그게 옴닉이건 인간이건 상관하지 않고 무고한 자를 지키기 위해 싸울 것이다.";


    }

}
