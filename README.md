# Problem Set 12

Back to doing something real, and back to working with a parter...if you want. Inheritance and interfaces might seem a little daunting at first, but learning to use them appropriately will make your programming lives much easier.

You'll be creating a two-game suite of casino table games: blackjack and a variation of poker.

## Getting Started

To get started, create a [GitHub](https://github.com/) repository to store your code. When you're finished, clone my skeleton to get all of the starter code and instructions. Setup a remote to push your code to your repository instead of mine.

### Setup

1. Login to your GitHub account and create a new repository named `pset-12`.
2. In the terminal, navigate to your `APCSA` directory on the `Desktop`.
```
$ cd ~/Desktop/APCSA
```
3. There's nothing to clone this time, unless you want a local copy of the `README`. Change into your newly created `pset-12` directory.
```
$ cd pset-12
```
4. Since we didn't clone anything, it's up to you to create your repository from scratch.
```
git init
git remote add origin git@github.com:YOUR-USERNAME/pset-12.git
```
5. It's also up to you to create the project in your editor of choice (i.e., Eclipse, VSCode, etc.).

Read through the requirements and specifications below and get to work!

## Rules

Before diving into the requirements, let's go over the rules of each game for those who havent played.

### Blackjack

Blackjack is a popular casino game where you play against the dealer. Normally, there is one dealer and one or more players. In this version, there will always be a single dealer and single player. The objective is to get as close to 21 points without going over. Here are the point values of the cards.

 * Two through Ten have the same point value as their ranks (i.e., a Two is worth 2 points).
 * Face cards (i.e., Jacks, Queens, and Kings) are worth 10 points.
 * Aces are worth either 1 point or 11 points (whichever is more favorable).

The player is dealt two cards (both face-up). The dealer is dealt two cards, too, but only the first card is face-up. The player goes first, and has two options.

 * Hit
 * Stay
 
If a player chooses to *hit*, he or she is dealt another card (face-up). This process continues until the player either chooses to *stay* (which ends the turn) or the value of the hand (i.e., all of the player's cards) exceeds 21 points.

At this point, it is the dealer's turn (in computer is the dealer). The dealer *must* hit until its hand totals at least 17 points. If the dealer has an Ace, it *must* hit until its hand totals at least 18 points.

#### Betting

Before the cards are dealt, the player chooses a number of chips to wager. The minimum bet is 2 chips, and the maximum bet is 20 chips. You must place bets in increments of 2.

The payout depends on the manner in which the player wins (or ties). There are only three possibilities.

 * A blackjack is when a player is dealt an Ace and a 10-point card in his or her initial hand. This pays 3-to-2.
 * A regular win is when the player's hand is greater than the dealer's, or the dealer's hand exceeded 21 points. This pays 1-to-1.
 * A push is a tie, and the player gets his or her bet back.

#### Additional Moves

There are two more moves, so to speak, available to players. They're a bit more advanced, and more difficult to implement. If you do so successfully, you can earn yourself some bonus points.

 * Double down
 * Split
 
It's up to you to figure out what these actions look like in the game, and when a player is allowed to take them. Don't forget to adjust how your program handles betting to account for doubling down and splitting.

### Poker

There are many variations of poker. We'll be implementing one called Five-Card Draw. It's a very popular game where players try to build the best possible hand. Our implementation will be a one-player version where the payout correlates with the strength of your hand. Suits didn't matter in Blackjack, but they very much do in all variations of poker. Let's go through the rules before talking about the possible hands and their respective payouts.

Players are dealt five cards from which to start building their strongest hand. Typically, players can trade in up to three cards (unless the player has an Ace, in which case he or she can trade in a fourth card). Players may only trade in once.

#### Betting

Before the cards are dealt, the player chooses a number of chips to wager. The minimum bet is 1 chip, and the maximum bet is 10 chips. After the initial cards are dealt (but before trading), the player may optionally make a second wager with the same minimums and maximums.

The payout depends on the strength of your hand.

 * A royal flush is a suited set of consecutive cards from 10 through Ace. This pays 250-to-1.
 * A straight flush is a suited set of five consecutive cards. This pays 100-to-1.
 * Four of a kind is four of the same card. This pays 25-to-1.
 * A full house is a combination of three of the same card, and two of another card. This pays 10-to-1.
 * A flush is when all of the cards have the same suit. This pays 5-to-1.
 * A straight is an unsuited set of five consecutive cards. This pays 3-to-1.
 * Three of a kind is three of the same card. This pays 2-to-1.
 * A two pair is two of the same card, and two of another card. This pays 1-to-1.
 * A pair is two of the same card. The player gets his or her bet back.
 
## Requirements

These may or may not apply to both games, but you'll need check off these boxes one way or another.

 * At least one of your classes must extend a superclass (i.e., use inheritance).
    * A `Deck` class that extends the `ArrayList` class would work quite nicely for any card game.
 * At least one of your classes must implement one or more interfaces.
    * A `Hand` should be sortable, so having your `Card` class implement the `Comparable` interface makes a lot of sense.
 * You must keep track of the player's name and his or her chip count at all times.
 * A player can play until he or she chooses to cash out, or he or she runs out of chips.
 * After cashing out, a player can leave the casino (i.e., quit) or play another game.

### Extra Credit

Make it graphical! This can earn you some serious bonus points. There's a caveat, though: it has to work, and it has to work well. Like anything else in life, the biggest potential rewards carry the biggest risks. If you do a lousy job, don't expect to be rewarded just because you tried.

And, yes, you can probably find some graphical applications out there pertaining to card games. A little copy-and-paste, and you're all set! I usually don't bother trying to track this kind of stuff down. But I can, and this time I will.

If I find that you plagiarized from the Internet, you'll get a zero. If you plagiarize from a classmate, you'll both get a zero. If you're concerned with someone stealing your code, then make your repository private.

## Deadline

Please read very carefully. Historically, most students lose points on problem sets for simply failing to read the instructions and requirements.

* April 26, 2020, at 11:59pm.

If you submit your problem set at midnight (i.e., April 27, 2020, at 12:00am), it is considered **late**!

### Submission Requirements

* Your code **must** compile. Code that fails to meet this minimum requirement will not be accepted.
* There must be **at least** 50 unique commits to your repository.
* Your code must meet each requirement outlined in the *Rules* and *Requirements* sections.
* Your code must adhere to the course style guidelines.

Happy coding!
