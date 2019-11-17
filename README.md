# CS193HW5 Individual Assignment
 
## What is this assignment
In this assignment, you will be adding a feature to a basic calculator function using a feature branch. After you complete your feature, you will learn how to resolve a merge conflict when you try to merge the feature into the master branch. 
 
## When is this due?
This homework will be due on Monday, 
 
## When will I know I'm done?
Advice: read the steps!!
 
You should be finished when the implementation of the calculator function is in your master branch.
 
## Step 1: Clone the repository. TODOs exist here
As you've done before, everything git related usually starts with a clone. Once you have created your copy of the Homework 5 repository (`homework-5-<your GitHub username>`), **run** the command `git clone https://github.com/purdue-cs193-fall-2019/homework-4-<your GitHub username>.git`. As you know, all this command does is to download a copy of the *remote* repository to your *local* machine. 
 
Now if you run `ls`, you should see a directory called `homework-4-<your GitHub username>`. `cd` into this directory and run `ls` again and you should see all the same files that GitHub shows in the browser for this repository. 

## Step 2: Create a Topic Branch

One very important part of good git practices is proper use of branches. In particular, before you make any changes, you should create a new branch off of the base branch (in this case a new branch off of the master branch) and give this new branch a name that describes the change you are going to make. Let's do this now. Make sure you are on the `master` branch and run `git checkout -b useCaseSwitch`. Run `git branch` again to verify that you have created and checked out a new branch called `useCaseSwitch`.

## Step 3: Make a Change

Take a look at the file `lab6.cpp` in the lab folder. Yes, yes, I know this program is written in C++, which the vast majority of you have probably never used before but, trust me, you can figure it out. To check what this program does, run the command `make` in the terminal. This command will compile `lab6.cpp` into an executable binary. Now run `./lab6` to see what the program does. 

As expected, all this program does right now is print out "Hello, World!". 

Your task for this branch is to change `lab6.cpp` to print "Hello, World!" a total of three (3) times instead of just once. To test your program, run `make` in the terminal, and then `./lab6` again to see if your output is what you want. You must remember to recompile your program with `make` before the changes you made will actually be run! 

Once you are satisfied that you have a functioning program that prints three times, commit your changes to `lab6.cpp` as we did in Lab 4. Make sure you push your changes to GitHub as well! (Remember, since we created a new branch, you will need to run `git push --set-upstream origin printThreeTimes` to set the upstream branch)

## Step 4: Open a Pull Request

Now that we have pushed our changes to our fork of the Lab 6 assignment repository, we need to merge these changes into the main repository `Purdue-CS193/lab-6-<Your GitHub Username>`. In a web browser, navigate to the repository page for your fork of the Lab 6 repository (`https://github.com/<Your GitHub Username>/lab-6-<Your GitHub Username>`). If you did everything correctly up to this point, GitHub should already display the `printThreeTimes` branch as a recently pushed to branch as shown in the image below: 

![alt text](https://i.imgur.com/aB6iS9v.png)

What we want to do next is called opening a *Pull Request*. A pull request is essentially a set of proposed changes to the main repository from a fork that can be looked over, reviewed, and commented on by the other contributors to the main repository.

Click the big green button that says `Compare & pull request` to start this process. You will be taken to a page where you can specify the settings of your pull request. Let's walk through what these are. 

The first option, `base fork` is the copy of the repository that we want these changes to go to. In our case, this is the `Purdue-CS193/lab-6-<Your GitHub Username>` repository. Make sure you have this selected for `base fork`.

The next option, which GitHub just calls `base` is the base branch to which the changes should go. Right now, we want our changes to go straight into the `master` branch of the main repository. Make sure `master` is selected for `base`.

On the other side of the arrow, we have the options for the source of the changes we want. The option `head fork` is the copy of the repository that already contains the changes you want to merge. In our case, this is `<Your GitHub Username>/lab-6-<Your GitHub Username>`. Make sure this option is selected.

Finally, the option titled `compare` is the branch in the `head fork` that contains the changes we want. In our case, this is the topic branch we just made. Select `printThreeTimes` here.

Underneath these options are where you create a title for the Pull Request and write a brief description. Fill these in with an appropriate title and description that tells the reader exactly what changes were made. 

Finally, GitHub handily displays to us the exact commits that will be merged from the `source` branch to the `base` branch, along with a line-by-line diff of the files that contain changes. Review these to ensure only the changes you expect are being merged. 

Once you have reviewed all the options, click the big green `Create pull request` button.

## Step 5: Let's do a Code Review!

Now that you have an active Pull Request from your fork to the assignment fork, it's time to perform one of the MOST IMPORTANT ASPECTS OF ANY SOFTWARE DEVELOPMENT JOB. A code review is a time for you to read through changes proposed by yourself, or more often a co-worker, and scan for easily noticable bugs, make comments regarding code formatting style, or just any general suggestion about how the code could have been written better. In most industry applications, code is simply not allowed to be merged into a production product without first passing several rounds of code reviews.

To perform your first code-review, navigate to the assignment repository in the browser `https://github.com/Purdue-CS193/lab-6-<Your GitHub Username>`. Right at the top, under the title of the repository is a tab called `Pull Requests`. Click on this tab to view all currently open pull requests to this repository. 

Right now, there should only be one open pull request - the one you just opened. Click on the title of this pull request to view its specifics. 

At the main page for this pull request, you can see the description you wrote earlier and an overview of what commits are included. Click on the `Files changed` tab to see what the specific changes are. You should see the changes you made to `lab6.cpp` earlier. 

Read through these changes, and leave yourself a comment about something you should change in your code (this could be anything, like "This print output should have two '!', not just one. Add another."). To leave a comment, click on the line of code which your comment pertains to, and write your comment, then click the `Start a review` button to start a code review. 

Your comment will be displayed next to the code it mentions. Click the `Finish your review` button to submit this code review to the author of this pull request (you). Here, you can leave a description of what you covered in the code review and select whether or not you approve of the changes proposed in the code review. For now, leave these options as the defaults, and click `Submit review`.

You will now be brought back to the main page of this pull request where you can see the comment you just left. Read your comment, and then go make the change you told yourself to do in `lab6.cpp` in the terminal (make sure your program still works as you expect by running `make` and `./lab6`!!!). Next, commit this change with a good, descriptive commit message, and push this change to your fork. 

After you've pushed this change, refresh the main page for your pull request again. Notice how your new commit is displayed in the timeline after the comments you left yourself earlier. You can see how this display of comments on the pull request followed by the subsequent commits that address these comments can be extremely useful to see! It is good practice to reply to a pull request comment saying something along the lines of `Resolved by commit <Commit id>` where `<Commit id>` is the id of the commit that contains the change requested by the comment. Go ahead and do this now and then click on "Resolve conversation" to mark this comment thread as resolved.

## Step 6: Merge Those Changes!

Ok, now that we have made a change, reviewed this change, and addressed its issues, it is time to ACTUALLY merge the changes into our assignment repository. This step is fairly simple. In the main page for our open pull request, towards the bottom there is a big green button titled "Merge pull request". Click on this button and then again on "Confirm merge". Congratulations! Your changes are now incorporated into your assignment repository. 

## Step 7: Things don't always go smoothly...

As you can probably guess, you'll more often than not be working on a project with more people than just yourself. With multiple people working in the same files, a phenomenon known as a "merge conflict" is bound to happen. A merge conflict is a instance where a change in another branch cannot be merged automatically by git with the changes you are trying to merge.

![alt text](https://developer.atlassian.com/blog/2015/01/a-better-pull-request/merge-conflict.png) 

In this section of the lab, we will simulate a merge conflict and work through resolving it. 

First, we must set up a change that will create a conflict. Navigate to your assignment repository `https://github.com/Purdue-CS193/lab-6-<Your GitHub Username>`. From GitHub in the browser, edit lab6.cpp and change the text that is printed by the program to say "Hello, CS193!" three times, instead of "Hello, World!" three times. Commit this change directly to the master branch.

Next, in your fork of this repository (the one you have cloned locally), in the terminal, checkout the `master` branch. Next, run `git checkout -b changeOutputOfProgram` to create a new topic branch for our new change. Run `git branch` to verify you are on the correct branch: `changeOutputOfProgram`. From this new branch, edit `lab6.cpp` to print out "Hello, Purdue CS!" three times instead of "Hello, World!". Commit these changes as we have done before. Then push to your fork by running `git push --set-upstream origin changeOutputOfProgram`. Follow Steps 4-6 to open a pull request from `changeOutputOfProgram` in your fork to the `master` branch in the assignment repository. Notice how GitHub warns you "Can't automatically merge" before you create the pull request. This is ok, go ahead and create the pull request anyway. We will resolve these later. 

On the main page for this new pull request, notice how we are unable to merge because of a conflict in `lab6.cpp`. We need to manually resolve this conflict before we can continue. 

To do this, we need to manually `pull` the new changes from the assignment repository `master` branch into our `changeOutputOfProgram` branch on the fork. To do this, perform the following steps: 
1. Add the assignment repository as a new "remote" respository called "upstream" by running `git remote add upstream https://github.com/Purdue-CS193/lab-6-<Your GitHub Username>`. This command tells git that you have a new GitHub repository that we are calling "upstream"
2. Make sure you are on the `changeOutputOfProgram` branch and run `git pull upstream master`. This will attempt to merge changes from the `master` branch of the assignment repository into your local `changeOutputOfProgram` branch. As we expected, git will greet you with the following dreadful message:

```
CONFLICT (content): Merge conflict in lab6.cpp
Automatic merge failed; fix conflicts and then commit the result.
```

Open up `lab6.cpp` in a text editor to see what's going on. 

As you can see, since we changed the text output by our program in the assignment repo AND our fork of the repository, git cannot automatically just choose which version of the change to keep. We have to tell it manually. 

git tells us the beginning of the merge conflict with a line that looks like this: `<<<<<<< HEAD` The line immediately following the `HEAD` line is the version of this line from our head branch (in this case our local `changeOutputOfProgram` branch). 

git then displays a line like this: `=======` that signifies the change between the version from the `HEAD` branch and the *base* branch. In this case, the *base* branch is the master branch in our assignment repository. 

Immediately following the line of `=` is the version of the change from the *base* branch, and immediately following this line is a line that looks like: `>>>>>>> 2b431c775e1734008578ebf48c4640b55960da2c`. This long string of numbers and letters is the commit id of the commit that conflicts with our local changes. 

To fix the merge conflict, you need to remove the version of the change that you do not want, and keep the version that you do want. Right now, we want the version that says "Hello, Purdue CS!" You also need to remove the line markers that git added: `<<<<<<< HEAD`, `=======`, and `>>>>>>> 2b431c775e1734008578ebf48c4640b55960da2c`. 

Once you have that done, check that your program still compiles and runs as you expect and then commit this merge by running: `git add lab6.cpp` followed by `git commit`. git will have the commit message already populated for you because this is a merge commit, so you can leave it as is. Now, push your changes and you've resolved your first merge conflict!

Now that the conflict is gone, check back on your pull request page. Refresh the page, and you can now see that you are able to merge these changes into the `master` branch on your assignment repository. Nice! Go ahead and click the merge button and you're done with the lab!
