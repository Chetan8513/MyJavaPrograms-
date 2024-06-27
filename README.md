# MyJavaPrograms-
This repo I create for logic building 


#git commands 

git branch --for checking the branch example main 

git branch -M main   -- to replace the branch name 


git checkout <branch-name> -- to navigate to other branch 

git checkout -b -- this command will create a new branch in your repo 


# So if you want to go to any different branch you can simply write git checkout <brach-name> you will navigate to that branch 

# If you want to delete any branch you can use -d

git checkout -d  <branch -name> ---this will delete the branch from repo 


git add .

git commit -m

git push (if any branch is mentioned )


# Now if you want to merge your changes means your branch to the main branch 


git diff main  --this will compare your branch to the main and compare the changes 


git merge main -- feature one branch will merge to your main branch 



# Through git hub how can we merge 

* we can do this through a pull request

* git pull origin main -- download all changes from remote to the local system


# merge conflicts

# undoing changes

Staging area (add but not committed)

git reset <file-name>

if you don't know just do

git reset --modify all changes 

# for committed 

git reset Head-1 (back 1 step) --if you commit and want to go back to your previous one then you can do this command 


git log (you can find all commit logs through this command 



git reset <hashcode> --   1234 If you want to go back to the 2 stages  from 4 stages then you can use the hash 


git reset -hard -- this will remove your changes from your local as well 


# fork 

you can use fork to get different repos to your remote repo and you make the changes and you able to merge the changes to your branch to the base repository 
