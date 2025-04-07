package model;

import java.util.List;

import static java.util.Arrays.asList;

public class Populate {
    public final static Artist bobDylan = new Artist("Bob Dylan", "US");

    public final static Track subterraneanHomesickBlues = new Track("Subterranean Homesick Blues", 141);
    public final static Track sheBelongstoMe = new Track("She Belongs to Me", 157);
    public final static Track maggiesFarm = new Track("Maggie's Farm", 224);
    public final static Track loveMinusZeroNoLimit = new Track("Love Minus Zero/No Limit", 171);
    public final static Track outlawBlues = new Track("Outlaw Blues", 185);
    public final static Track ontheRoadAgain = new Track("On the Road Again", 155);
    public final static Track bobDylans115thDream = new Track("Bob Dylan's 115th Dream", 390);
    public final static Track mrTambourineMan = new Track("Mr. Tambourine Man", 330);
    public final static Track gatesofEden = new Track("Gates of Eden", 340);
    public final static Track itsAlrightMa = new Track("It's Alright, Ma (I'm Only Bleeding)", 449);
    public final static Track itsAllOverNowBabyBlue = new Track("It's All Over Now, Baby Blue", 252);

    public final static Album bringingItAllBackHome = new Album("Bringing It All Back Home",
            asList(bobDylan),
            asList(subterraneanHomesickBlues,
                    sheBelongstoMe,
                    maggiesFarm,
                    loveMinusZeroNoLimit,
                    outlawBlues,
                    ontheRoadAgain,
                    bobDylans115thDream,
                    mrTambourineMan,
                    gatesofEden,
                    itsAlrightMa,
                    itsAllOverNowBabyBlue));

    public final static Artist jimiHendrix = new Artist("Jimi Hendrix", "US");
    public final static Artist noelRedding = new Artist("Noel Redding", "UK");
    public final static Artist mitchMitchell = new Artist("Mitch Mitchell", "UK");
    public final static Artist theJimiHendrixExperience = new Artist("The Jimi Hendrix Experience", asList(jimiHendrix, noelRedding, mitchMitchell), "UK");

    public final static Track purpleHaze = new Track("Purple Haze", 166);
    public final static Track manicDepression = new Track("Manic Depression", 226);
    public final static Track heyJoe = new Track("Hey Joe", 203);
    public final static Track loveorConfusion = new Track("Love or Confusion", 195);
    public final static Track mayThisBeLove = new Track("May This Be Love", 194);
    public final static Track iDontLiveToday = new Track("I Don't Live Today", 225);
    public final static Track theWindCriesMary = new Track("The Wind Cries Mary", 201);
    public final static Track fire = new Track("Fire", 154);
    public final static Track thirdStonefromtheSun = new Track("Third Stone from the Sun", 400);
    public final static Track foxyLady = new Track("Foxy Lady", 195);
    public final static Track areYouExperiencedTrack = new Track("Are You Experienced?", 225);

    public final static Album areYouExperienced = new Album("Are You Experienced",
            asList(theJimiHendrixExperience),
            asList(purpleHaze,
                    manicDepression,
                    heyJoe,
                    loveorConfusion,
                    mayThisBeLove,
                    iDontLiveToday,
                    theWindCriesMary,
                    fire,
                    thirdStonefromtheSun,
                    foxyLady,
                    areYouExperiencedTrack));

    public final static Artist billyJoel = new Artist("Billy Joel", "US");

    public final static Track movinOut = new Track("Movin' Out (Anthony's Song)", 210);
    public final static Track theStrangerTrack = new Track("The Stranger", 310);
    public final static Track justtheWayYouAre = new Track("Just the Way You Are", 292);
    public final static Track scenesfromanItalianRestaurant = new Track("Scenes from an Italian Restaurant", 597);
    public final static Track vienna = new Track("Vienna", 214);
    public final static Track onlytheGoodDieYoung = new Track("Only the Good Die Young", 225);
    public final static Track shesAlwaysaWoman = new Track("She's Always a Woman", 201);
    public final static Track getItRighttheFirstTime = new Track("Get It Right the First Time", 227);
    public final static Track everybodyHasaDream = new Track("Everybody Has a Dream/The Stranger (Reprise)", 408);

    public final static Album theStranger = new Album("The Stranger",
            asList(billyJoel),
            asList(movinOut,
                    theStrangerTrack,
                    justtheWayYouAre,
                    scenesfromanItalianRestaurant,
                    vienna,
                    onlytheGoodDieYoung,
                    shesAlwaysaWoman,
                    getItRighttheFirstTime,
                    everybodyHasaDream));


    public final static Artist nickMason = new Artist("Nick Mason", "US");
    public final static Artist rogerWaters = new Artist("Roger Waters", "UK");
    public final static Artist richardWright = new Artist("Richard Wright", "UK");
    public final static Artist sydBarrett = new Artist("Syd Barrett", "UK");
    public final static Artist davidGilmour = new Artist("David Gilmour", "UK");
    public final static Artist pinkFloyd = new Artist("Pink Floyd", asList(nickMason, rogerWaters, richardWright, sydBarrett, davidGilmour), "UK");

    public final static Track intheFlesh1 = new Track("In the Flesh?", 196);
    public final static Track theThinIce = new Track("The Thin Ice", 147);
    public final static Track anotherBrickintheWallPartI = new Track("Another Brick in the Wall (Part I)", 201);
    public final static Track theHappiestDaysofOurLives = new Track("The Happiest Days of Our Lives", 166);
    public final static Track anotherBrickintheWallPartII = new Track("Another Brick in the Wall (Part II)", 229);
    public final static Track mother = new Track("Mother", 332);
    public final static Track goodbyeBlueSky = new Track("Goodbye Blue Sky", 165);
    public final static Track emptySpaces = new Track("Empty Spaces", 130);
    public final static Track youngLust = new Track("Young Lust", 205);
    public final static Track oneofMyTurns = new Track("One of My Turns", 221);
    public final static Track dontLeaveMeNow = new Track("Don't Leave Me Now", 248);
    public final static Track anotherBrickintheWallPartIII = new Track("Another Brick in the Wall (Part III)", 168);
    public final static Track goodbyeCruelWorld = new Track("Goodbye Cruel World", 48);
    public final static Track heyYou = new Track("Hey You", 280);
    public final static Track isThereAnybodyOutThere = new Track("Is There Anybody Out There?", 164);
    public final static Track nobodyHome = new Track("Nobody Home", 206);
    public final static Track vera = new Track("Vera", 95);
    public final static Track bringtheBoysBackHome = new Track("Bring the Boys Back Home", 81);
    public final static Track comfortablyNumb = new Track("Comfortably Numb", 383);
    public final static Track theShowMustGoOn = new Track("The Show Must Go On", 96);
    public final static Track intheFlesh2 = new Track("In the Flesh", 255);
    public final static Track runLikeHell = new Track("Run Like Hell", 260);
    public final static Track waitingfortheWorms = new Track("Waiting for the Worms", 244);
    public final static Track stop = new Track("Stop", 30);
    public final static Track theTrial = new Track("The Trial", 313);
    public final static Track outsidetheWall = new Track("Outside the Wall", 101);

    public final static Album theWall = new Album("The Wall",
            asList(pinkFloyd),
            asList(intheFlesh1,
                    theThinIce,
                    anotherBrickintheWallPartI,
                    theHappiestDaysofOurLives,
                    anotherBrickintheWallPartII,
                    mother,
                    goodbyeBlueSky,
                    emptySpaces,
                    youngLust,
                    oneofMyTurns,
                    dontLeaveMeNow,
                    anotherBrickintheWallPartIII,
                    goodbyeCruelWorld,
                    heyYou,
                    isThereAnybodyOutThere,
                    nobodyHome,
                    vera,
                    bringtheBoysBackHome,
                    comfortablyNumb,
                    theShowMustGoOn,
                    intheFlesh2,
                    runLikeHell,
                    waitingfortheWorms,
                    stop,
                    theTrial,
                    outsidetheWall));

    public final static List<Artist> allArtists = asList(bobDylan, theJimiHendrixExperience, billyJoel, pinkFloyd);
    public final static List<Album> allAlbums = asList(bringingItAllBackHome, areYouExperienced, theStranger, theWall);
    public final static List<Track> allTracks =
            asList(subterraneanHomesickBlues,
                    sheBelongstoMe,
                    maggiesFarm,
                    loveMinusZeroNoLimit,
                    outlawBlues,
                    ontheRoadAgain,
                    bobDylans115thDream,
                    mrTambourineMan,
                    gatesofEden,
                    itsAlrightMa,
                    itsAllOverNowBabyBlue,
                    purpleHaze,
                    manicDepression,
                    heyJoe,
                    loveorConfusion,
                    mayThisBeLove,
                    iDontLiveToday,
                    theWindCriesMary,
                    fire,
                    thirdStonefromtheSun,
                    foxyLady,
                    areYouExperiencedTrack,
                    movinOut,
                    theStrangerTrack,
                    justtheWayYouAre,
                    scenesfromanItalianRestaurant,
                    vienna,
                    onlytheGoodDieYoung,
                    shesAlwaysaWoman,
                    getItRighttheFirstTime,
                    everybodyHasaDream,
                    intheFlesh1,
                    theThinIce,
                    anotherBrickintheWallPartI,
                    theHappiestDaysofOurLives,
                    anotherBrickintheWallPartII,
                    mother,
                    goodbyeBlueSky,
                    emptySpaces,
                    youngLust,
                    oneofMyTurns,
                    dontLeaveMeNow,
                    anotherBrickintheWallPartIII,
                    goodbyeCruelWorld,
                    heyYou,
                    isThereAnybodyOutThere,
                    nobodyHome,
                    vera,
                    bringtheBoysBackHome,
                    comfortablyNumb,
                    theShowMustGoOn,
                    intheFlesh2,
                    runLikeHell,
                    waitingfortheWorms,
                    stop,
                    theTrial,
                    outsidetheWall);
}
