# CS193HW5 Individual Assignment
 
## What is this assignment
In this assignment, you will be adding a feature to a basic calculator function using a feature branch. After you complete your feature, you will learn how to resolve a merge conflict when you try to merge the feature into the master branch. 
 
## When is this due?
This homework will be due on Monday, 
 
## When will I know I'm done?
Advice: read the steps!!
 
You should be finished when the implementation of the calculator function is in your master branch.
 
## Step 1: Clone the repository. TODOs exist here
As you've done before, everything git related usually starts with a clone. Once you have accepted the assignment and downloaded the classroom code, **run** the command `git clone https://github.com/purdue-cs193-fall-2019/CS193HW5-individual.git`. As you know, all this command does is to download a copy of the *remote* repository to your *local* machine. 
 
Now if you run `ls`, you should see a directory called `homework-5-individual-<your GitHub username>`. `cd` into this directory and run `ls` again and you should see all the same files that GitHub shows in the browser for this repository. 

## Step 2: Create a Feature Branch
The current calculator uses if-elseif-else logic, as seen in test1.java. However, management has decided that this needs to be implemented using switch-cases. Your job now is to change the method's implementation to use a switch statement instead. 

One very important part of good git practices is proper use of branches. In particular, before you make any changes, you should create a new branch off of the base branch (in this case a new branch off of the master branch) and give this new branch a name that describes the change you are going to make. Let's do this now. Make sure you are on the `master` branch and run `git checkout -b useCaseSwitch`. Run `git branch` again to verify that you have created and checked out a new branch called `useCaseSwitch`.

## Step 3: Write the new feature

The method `basicCalculator` takes in an operator and two numbers and returns a result based on that operator. Keep in mind that the operator is an Enum. The values of the enum are: ADD, SUBTRACT, MULTIPLY, DIVIDE. If you are unsure how to do enum comparisons feel free to look on Google. **You must implement this method with a switch-case**.

Once you are satisfied that you have a functioning calculator that uses case-switch statements, add and commit your changes. Make sure you push your changes to GitHub as well! (Remember, since we created a new branch, you will need to run `git push --set-upstream origin useCaseSwitch` to set the upstream branch)

## Step 4: Your Coworker Makes a Scene!
In this part, you'll be playing the part of a pesky coworker who decided to ruin the calculator code with lies! Go to your homework 5 respository on github *browser*. Click on test.java and then on the pencil icon to edit the file in the browser. Replace the basicCalculator function with the following code:

`public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

        if(operation == Operation.ADD) {
            System.out.println("CS193 sucks");
        }
        else if(operation == Operation.SUBTRACT) {
            System.out.println("CS193 is not everyone's favorite class");
        }
        else if(operation == Operation.MULTIPLY) {
            System.out.println("The CS193 lecturers do not want us to thrive in CS");
        }
        else {
            if(num2 == 0) {
                System.out.println("Error: u suck");
            }
            else {
                result = num1 / num2;
            }
        }

        return result;
    }
`


## Step 4: Open a Pull Request

Now that we have pushed our changes to our feature branch, we need to merge these changes into the master branch. In a web browser, navigate to your homework 5 repository. If you did everything correctly up to this point, GitHub should already display the `useCaseSwitch` branch as a recently pushed to branch as shown in the image below: 

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

## Step 7: Things don't always go smoothly...

As you can probably guess, you'll more often than not be working on a project with more people than just yourself. With multiple people working in the same files, a phenomenon known as a "merge conflict" is bound to happen. A merge conflict is a instance where a change in another branch cannot be merged automatically by git with the changes you are trying to merge.

![alt text](https://developer.atlassian.com/blog/2015/01/a-better-pull-request/merge-conflict.png) 

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


## Step 6: Merge Those Changes!

Ok, now that we have made a change, reviewed this change, and addressed its issues, it is time to ACTUALLY merge the changes into our assignment repository. This step is fairly simple. In the main page for our open pull request, towards the bottom there is a big green button titled "Merge pull request". Click on this button and then again on "Confirm merge". Congratulations! Your changes are now incorporated into your assignment repository. 

