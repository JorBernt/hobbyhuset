$(() => {
    $.get("/hentVarer", varer => {
        formaterData(varer);
    })
})

const formaterData = varer => {
    for(let vare of varer) {
        const ut = "<tr>" +
            "<td>"+vare.vNr+"</td>" +
            "<td>"+vare.betegnelse+"</td>" +
            "<td>"+vare.pris+"</td>" +
            "<td>"+vare.antall+"</td>" +
            "<td>"+vare.hylle+"</td>" +
            "<td>"+vare.katNr+"</td>" +
            "</tr>"
        $("#vareListe").append(ut)
    }
}