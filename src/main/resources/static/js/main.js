const genreElements = document.querySelectorAll('.genre-item');
const categoryElements = document.querySelectorAll('.category-item');

console.log('js file is called');

function filterItems(selectedEl, genre, category) {
    console.log('filter func is called');
    console.log(genre,category);
    const elements = document.querySelectorAll('.list-item');
    const elementsToFilter = [];

    // removing active classes
    for (let el of elements) {
        removeClass(el, 'disabled');
    }

    if (genre) {
        for (let el of genreElements) {
            removeClass(el, 'active');
        }
        for (let el of elements) {
            if (genre !== el.getAttribute('data-genre')) {
                elementsToFilter.push(el);
            }
        }
    }
    if (category) {
        for (let el of categoryElements) {
            removeClass(el, 'active');
        }
        for (let el of elements) {
            if (category !== el.getAttribute('data-category')) {
                elementsToFilter.push(el);
            }
        }
    }
    addClass(selectedEl, 'active');

    for (let el of elementsToFilter) {
        addClass(el, 'disabled');
    }
}

function addClass(el, className) {
    el.classList.add(className);
}

function removeClass(el, className) {
    el.classList.remove(className);
}