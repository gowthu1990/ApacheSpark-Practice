class Project {
    constructor(tasks)
    {
        this.tasks = tasks;
    }

    getTaskHours() {
        var totalhours = 0;
        for(var i = 0;i<tasks.length;i++)
        {
            totalhours = totalhours + this.tasks[i].hours
        }

    }

    splitProject() {
        if(this.tasks[0].hours<100)
        {
            if(getTaskHours()>100)
            {
                this.tasks.
                return new Project(this.tasks.pop())
            }
        }
    }
}

class Task {
    constructor(hours)
    {
        this.hours = hours;
    }
}